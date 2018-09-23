public class isPartialSudoku {

	public boolean isPartialSudoku() {
		
		boolean isInEach = true;
		boolean noDuplicates = true;
		boolean hasZero = false;
				
		int [][] regions;
		for (int i=0; i<9; i++)
			regions[i] = getRegion(i);
		
		for (region : regions) {
			
			// Each 1st row is in each region
			int[] firstRow = {region[0], region[1], region[2]};
			
			for (region : regions) {
				if (!Array.asList(region).contains(firstRow[0])) isInEach = false;
				if (!Array.asList(region).contains(firstRow[1])) isInEach = false;
				if (!Array.asList(region).contains(firstRow[2])) isInEach = false;
			}
			
			// Each has no duplicates:
			for (int i=0; i<9; i++)
				if (!hasDubplicates(regions(i)))
					noDuplicates = false;
			
			// There's one zero at least:
			if (Array.asList(region).contains(0))
				hasZero = true;
		}
		
		return noDuplicates && isInEach && hasZero;
		
	}

}
