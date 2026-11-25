package controllers;

import java.util.List;
import models.Incidente;

public class IncidenteController {
    public List<Incidente> sort(List<Incidente> incidentes) {
        incidentes.sort(null);
        return incidentes; 
    }

    public int busquedaBinaria(List<Incidente> incidentes, Incidente objetivo) {
        int low = 0;
        int high = incidentes.size() - 1;
        while(low <= high) {
            int mid = (low + high) / 2;
            Incidente midIncidente = incidentes.get(mid);
            int comparison = midIncidente.compareTo(objetivo);
            if(comparison < 0) {
                low = mid + 1;
            } else if(comparison > 0) {
                high = mid - 1;
            } else {
                return mid; // Encontrado
            }
        }
        return -1; // No encontrado
    }
}
