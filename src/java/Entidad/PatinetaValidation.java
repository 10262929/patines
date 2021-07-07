package Entidad;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 *
 * @author : Braham Marin
 */
public class PatinetaValidation implements Validator {

    /**
     *
     * @param type
     * @return
     */
    @Override
    public boolean supports(Class<?> type) {
        return Patineta.class.isAssignableFrom(type);

    }

    /**
     *
     * @param o
     * @param errors
     */
    @Override
    public void validate(Object o, Errors errors) {
        Patineta patineta = (Patineta) o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,
                "nombre",
                "required.nombre",
                "EL nombre no puede estar vacio.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,
                "apellidos",
                "required.apellidos",
                "EL apellido es incorrecto o esta vacio el campo.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,
                "codigoPatin",
                "required.codigoPatin",
                "EL codigo de la patineta es incorrecto o esta vacio el campo.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,
                "color",
                "required.color",
                "EL color de la patineta es incorrecto o esta vacio el campo.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,
                "descripcion",
                "required.descripcion",
                "La descripcion de la patineta es incorrecto o esta vacio el campo.");
    }
     
    

}
