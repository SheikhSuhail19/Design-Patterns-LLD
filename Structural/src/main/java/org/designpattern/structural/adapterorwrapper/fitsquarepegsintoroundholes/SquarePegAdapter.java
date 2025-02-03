package org.designpattern.structural.adapterorwrapper.fitsquarepegsintoroundholes;

/**
 * Adapter allows fitting square pegs into round holes.
 */
public class SquarePegAdapter extends RoundPeg
{
	// In reality, the adapter contains an instance of the
	// SquarePeg class.
	private final SquarePeg peg;

	public SquarePegAdapter(SquarePeg peg)
	{
		this.peg = peg;
	}

	@Override
	public double getRadius()
	{
		double result;
		// The adapter pretends that it's a round peg with a
		// radius that could fit the square peg that the adapter
		// actually wraps.

		// Calculate a minimum circle radius, which can fit this peg.
		result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
		return result;
	}
}
