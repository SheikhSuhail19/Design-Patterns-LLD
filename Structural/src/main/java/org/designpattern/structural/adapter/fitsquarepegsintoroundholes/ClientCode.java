package org.designpattern.structural.adapter.fitsquarepegsintoroundholes;

public class ClientCode
{
	public static void main(String[] args)
	{
		RoundHole roundHole = new RoundHole(5);

		RoundPeg roundPeg = new RoundPeg(5);
		if (roundHole.fits(roundPeg))
		{
			System.out.println("Round peg r5 fits round hole r5.");
		}

		RoundPeg largeRoundPeg = new RoundPeg(10);
		if (!roundHole.fits(largeRoundPeg))
		{
			System.out.println("Round peg r10 does not fit into round hole r5.");
		}

		SquarePeg squarePeg = new SquarePeg(1);
		// Below won't compile because SquarePeg is not compatible with RoundHole
		// if (roundHole.fits(squarePeg)) {
		// 	System.out.println("Square peg w2 fits round hole r5.");
		// }

		SquarePeg smallSquarePeg = new SquarePeg(2);
		SquarePeg largeSquarePeg = new SquarePeg(20);

		SquarePegAdapter smallSquarePegAdapter = new SquarePegAdapter(smallSquarePeg);
		if (roundHole.fits(smallSquarePegAdapter))
		{
			System.out.println("Square peg w2 fits round hole r5.");
		}

		SquarePegAdapter largeSquarePegAdapter = new SquarePegAdapter(largeSquarePeg);
		if (!roundHole.fits(largeSquarePegAdapter))
		{
			System.out.println("Square peg w20 does not fit into round hole r5.");
		}


	}
}
