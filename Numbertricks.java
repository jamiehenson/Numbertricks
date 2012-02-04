package numbertricks;

// Numbertricks.
// (C) Jamie Henson 2011
//
// So far, this program can find these things about a number:
//  - its factors
//  - whether it is a perfect number
//  - the primes that come before it
//  - how many primes come before it
//  - whether it is prime itself
//  - its product of primes representation (optimised)
//  - whether it is a triangular number
//  - whether it is a square number
//  - whether it is part of the Fibonacci sequence
//  - the factorial version of it
//
// Next on the list:
//  - whether it is part of next week's lottery numbers
//

import java.math.*;

public class Numbertricks
{

  public Numbertricks(){
    super();
  }
  
  public static String go(String input, boolean showfac)
  {
    // Create a new instance of the program
    Numbertricks program = new Numbertricks();
    StringBuffer mainoutput = new StringBuffer();

    // Acquire the information
    String primes = program.getprimes(input);
    String factors = program.getfactors(input);
    String factorial = program.getfactorial(input);
    String sequences = program.sequencecheck(input);
    
    // Print the outputs
    mainoutput.append("Factors: " + factors);
    mainoutput.append("\n\nPrimes: " + primes);
    mainoutput.append("\n" + sequences);
    if (showfac) mainoutput.append("\nFactorial: " + factorial);
    return mainoutput.toString();
  }

// Checks if the input value is indeed a numeric value (within range)
  public static boolean numbercheck(String input)
  {
  // If the number can be parsed as an integer, and is greater than 0, then that's
  // fine by me. Else, offer them the chance to try again.
    try
    {
      Integer.parseInt(input);
			int temp = Integer.parseInt(input);
			if (0 - temp <= 0) return true;
			return false;
    }
    catch(Exception e)
    {
      return false;
    }
  }

// Find out whether the number belongs to certain sequences
  String sequencecheck(String args)
  {
    int value = Integer.parseInt(args), tritotal=1;
		// Zero isn't allowed, so end if it is found. Who types 0 anyway??
		if (value == 0) return "Number given is 0. It doesn't belong to anything...";
    String fibresult = "No.", triresult = "No.", squresult = "No.";

    // Check for triangular numbers
    for (int i = 1;i<value;i++)
    {
      if (value == tritotal) triresult = "Yes!";
      tritotal += (i+1);
    }

    // Check for square numbers
    double dvalue = (double) value;
    for (int i = 1;i<value;i++)
    {
      double sq = Math.sqrt(dvalue);
      if (Math.floor(sq) == sq)
      {
        squresult = "Yes!";
      }
    }

    // Check for fibonacci sequence
    int[] fibvalues = new int[value+1];
    fibvalues[0] = 0;
    fibvalues[1] = 1;
    for (int i = 2;i<=value;i++)
    {
      fibvalues[i] = fibvalues[i-1] + fibvalues[i-2];
    }

    for (int i = 0;i<=value;i++)
    {
      if (fibvalues[i] == value) fibresult = "Yes!";
    }

    // Piece the findings together in one string to return to the parent
    // method
    StringBuffer seq = new StringBuffer();
    seq.append("\nSequence information:\n");
    seq.append("Is it a triangular number? " + triresult + "\n");
    seq.append("Is it a square number? " + squresult + "\n");
    seq.append("Is it part of the Fibonacci sequence? " + fibresult);
    String sequences = seq.toString();
    return sequences;
  }

// Obtain an ascending list of factors, and additionally whether it is 'perfect'
  String getfactors(String args)
  {
    long facnum = Long.parseLong(args);

		// Again, check for errant zeroes
		if (facnum == 0) return "N/A. Number given is 0.";
    int factotal = 0;
    String perresult = "No.";
    StringBuffer fac = new StringBuffer();

    // If a number can get mod 0 with another, then it is a factor. Loop.
    for(int i=1;i<=facnum;i++)
    {
      if (facnum % i == 0){
        fac.append(i);
        factotal += i; // Total used for determining perfect numbers
        fac.append(", ");
      }
    }

    // Test for perfection
    if (factotal >> 1 == facnum) perresult = "Yes!";

    fac.delete(fac.length()-2,fac.length());
    fac.append("\nIs the number perfect? " + perresult);
    String faclist = fac.toString();
    return faclist;
  }

// Obtain an ascending list of primes by using the Sieve of Eratosthenes algorithm
// State the number of primes
// State if the number itself is prime
  String getprimes(String args)
  {
    int prinum = Integer.parseInt(args), amount=0, i=0, j=0, k=0, l=0;
    double[] primes = new double[prinum];

		if (prinum == 1 || prinum == 0) return "N/A. Number given is " + prinum + ".";

    StringBuffer pri = new StringBuffer();
    String primecheck = "No.", prodprim = "";

    // Check if 1 is found, this is a dodgy answer, since it is not prime
    // (arguably), and contains no primes
    if (args == "1")
    {
      pri.append("N/A");
      String prilist = pri.toString();
      return prilist;
    }

    boolean[] PrimeMarker = new boolean[prinum+1];
    for(i=2;i<=prinum;i++) PrimeMarker[i] = true;

    // Mark non-primes in true Eratosthenes fashion.
    for(i=2;i*i<=prinum;i++)
    {
      if (PrimeMarker[i] == true)
      {
        for (j=i;i*j<=prinum;j++) PrimeMarker[i*j] = false;
      }
    }

    for(i=2;i<=prinum;i++)
    {
      if (PrimeMarker[i] == true)
      {
        pri.append(i);
        pri.append(", ");
        amount++;
        primes[l] = (double) i;
        l++;
        if ((PrimeMarker[i] == true) && (i == prinum))
        {
          primecheck = "Yes!";
        }
      }
    }

    // Fetch the product of primes
    prodprim = getpop(prinum, primes);

    pri.delete(pri.length()-2,pri.length());
    pri.append("\nNumber of primes: " + amount);
    pri.append("\nIs this prime? " + primecheck);
    pri.append("\nProduct of primes representation: " + prodprim);
    String prilist = pri.toString();
    return prilist;
  }

// Acquire product of primes
  String getpop(int prinum, double[] primes)
  {
    int i=0,j=0,k=0;
    double dpri = (double) prinum;
    StringBuffer products = new StringBuffer();
    String prodprim = "";

    for (i=0;i<prinum;i++)
    {
      // Work up through the primes found before. If it is a factor, include
      // and recurse. If not, move on to the next prime. Divide through each
      // time
      while (((dpri/primes[i]) == Math.ceil(dpri/primes[i])) && (dpri/primes[i]) != 1)
      {
        products.append((int)primes[i] + " * ");
        dpri = dpri/primes[i];
      }

      // If the number found by dividing through is prime, you're done
      for (k=0;k<prinum;k++)
      {
        if (primes[k] == dpri || dpri == 1)
        {
          products.append((int)dpri);
          prodprim = products.toString();
          return prodprim;
        }
      }
    }
    prodprim = products.toString();
    return prodprim;
  }

// Acquire factorial value, using the larger BigInteger type
  String getfactorial(String args)
  {
    int num = Integer.parseInt(args);
    BigDecimal subtotal = new BigDecimal("1");
    if (num == 1 || num == 0) return "0";
    if (num < 0) return "Underflow. Bigger than 0, dammit!";

    // Go through and multiply back, collecting one hefty result
    for (int i=(num-1);i>0;i--)
    {
      subtotal = subtotal.multiply(BigDecimal.valueOf(i));
    }
    // Cut off some of the baggage by using exponential notation
    subtotal = subtotal.setScale(2,BigDecimal.ROUND_HALF_UP);
    // Cut off more baggage by killing those trailing zeroes
    subtotal = subtotal.stripTrailingZeros();
    String total = subtotal.toString();
    return total;
  }
}

