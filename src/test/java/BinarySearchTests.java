import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTests {

    @Test
    public void elementIsInSequenceLengthEqualsOne(){

        int[] seq = {8};
        final int KEY = 8;

        SearchResult result = BinarySearch.search(KEY,seq);

        Assertions.assertEquals(true,result.isFound());
        Assertions.assertEquals(0,result.getPosition());
    }

    @Test
    public void elementIsNotInSequenceLengthEqualsOne(){

    }

    @Test
    public void elementIsFirstElementOfSeq(){

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
