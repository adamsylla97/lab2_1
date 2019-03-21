import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTests {

    @Test
    public void elementIsInSequenceLengthEqualsOne(){

        int[] seq = {8};
        final int KEY = 8;
        final int EXPECTED_VALUE = 0;

        SearchResult result = BinarySearch.search(KEY,seq);

        Assertions.assertEquals(true,result.isFound());
        Assertions.assertEquals(EXPECTED_VALUE,result.getPosition());
    }

    @Test
    public void elementIsNotInSequenceLengthEqualsOne(){

        int[] seq = {3};
        final int KEY = 4;
        final int EXPECTED_VALUE = -1;

        SearchResult result = BinarySearch.search(KEY,seq);

        Assertions.assertEquals(false,result.isFound());
        Assertions.assertEquals(EXPECTED_VALUE,result.getPosition());

    }

    @Test
    public void elementIsFirstElementOfSeq(){

        int[] seq = {1,2,3,4};
        final int KEY = 1;
        final int EXPECTED_VALUE = 0;

        SearchResult result = BinarySearch.search(KEY,seq);

        Assertions.assertEquals(true,result.isFound());
        Assertions.assertEquals(EXPECTED_VALUE,result.getPosition());

    }

    @Test
    public void elementIsLastElementofSeq(){

    }

    @Test
    public void elementIsInTheMiddleOfSeq(){

    }

    @Test
    public void elementIsNotInSequenceLengthEqualsMoreThanOne(){

    }

}
