package no.idporten.test.generate.fnr;

import no.idporten.validators.identifier.PersonIdentifierValidator;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SyntheticFodselsnummerGeneratorTest {

    public void setup(){
        PersonIdentifierValidator.setSyntheticPersonIdentifiersAllowed(true);
        PersonIdentifierValidator.setRealPersonIdentifiersAllowed(false);
    }

    @Test
    public void when_generate_one_fnr_then_one_valid_fnr_is_returned_for_year(){
        SyntheticFodselsnummerGenerator generator = new SyntheticFodselsnummerGenerator();
        int birthYear = 2001;
        String fnr = generator.fodselsnummerFromYear(birthYear);
        System.out.println(fnr);
        assertNotNull(fnr);
        assertEquals(11, fnr.length());
        assertEquals(4, fnr.indexOf("01")); //ddMMyy.....
        PersonIdentifierValidator.isValid(fnr);
    }

    @Test
    public void when_generate_one_fnr_then_one_valid_fnr_is_returned(){
        SyntheticFodselsnummerGenerator generator = new SyntheticFodselsnummerGenerator();
        String fnr = generator.fodselsnummer();
        System.out.println(fnr);
        assertNotNull(fnr);
        PersonIdentifierValidator.isValid(fnr);
    }

    @Test
    public void when_generate_10_fnr_then_10_valid_fnr_is_returned(){
        SyntheticFodselsnummerGenerator generator = new SyntheticFodselsnummerGenerator();
        List<String> fnrs = generator.listOfFodselsnummers(10);
        assertEquals(10, fnrs.size());
        for(String fnr: fnrs){
            System.out.println(fnr);
            assertNotNull(fnr);
            PersonIdentifierValidator.isValid(fnr);
        }

    }
}