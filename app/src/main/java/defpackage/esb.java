package defpackage;

import com.google.android.apps.camera.debug.metrics.CYLp.GdpuLBytnYW;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class esb {
    public final eyn a;
    public final cnj b;
    private final Class c;
    private final List d;
    private final String e;

    public final esw a(eqx eqxVar, int i, int i2, eqm eqmVar, List list) throws ess {
        List list2 = this.d;
        int size = list2.size();
        esw eswVarA = null;
        for (int i3 = 0; i3 < size; i3++) {
            eqo eqoVar = (eqo) list2.get(i3);
            try {
                if (eqoVar.b(eqxVar.a(), eqmVar)) {
                    eswVarA = eqoVar.a(eqxVar.a(), i, i2, eqmVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                list.add(e);
            }
            if (eswVarA != null) {
                break;
            }
        }
        if (eswVarA != null) {
            return eswVarA;
        }
        throw new ess(this.e, new ArrayList(list));
    }

    public final String toString() {
        eyn eynVar = this.a;
        List list = this.d;
        return "DecodePath{ dataClass=" + String.valueOf(this.c) + ", decoders=" + String.valueOf(list) + ", transcoder=" + eynVar.toString() + "}";
    }

    public esb(Class cls, Class cls2, Class cls3, List list, eyn eynVar, cnj cnjVar) {
        this.c = cls;
        this.d = list;
        this.a = eynVar;
        this.b = cnjVar;
        String simpleName = cls.getSimpleName();
        String simpleName2 = cls2.getSimpleName();
        String simpleName3 = cls3.getSimpleName();
        StringBuilder sb = new StringBuilder("Failed DecodePath{");
        sb.append(simpleName);
        String str = GdpuLBytnYW.CSXuQwCnsIRThzI;
        sb.append(str);
        sb.append(simpleName2);
        sb.append(str);
        sb.append(simpleName3);
        sb.append("}");
        this.e = sb.toString();
    }
}
