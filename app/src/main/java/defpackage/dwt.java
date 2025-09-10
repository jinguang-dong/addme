package defpackage;

import com.google.ar.core.ImageMetadata;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class dwt {
    public UUID a;
    public ebx b;
    public final Set c;
    private final Class d;

    public dwt(Class cls) {
        this.d = cls;
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        this.a = uuidRandomUUID;
        String string = this.a.toString();
        string.getClass();
        String name = cls.getName();
        name.getClass();
        this.b = new ebx(string, 0, name, (String) null, (dvx) null, (dvx) null, 0L, 0L, 0L, (dvv) null, 0, 0, 0L, 0L, 0L, 0L, false, 0, 0, 0L, 0, 0, (String) null, (Boolean) null, 33554426);
        String name2 = cls.getName();
        name2.getClass();
        this.c = ske.aW(name2);
    }

    public abstract tdy a();

    public final void b(String str) {
        this.c.add(str);
    }

    public final void c(dvv dvvVar) {
        this.b.j = dvvVar;
    }

    public final tdy d() {
        tdy tdyVarA = a();
        dvv dvvVar = this.b.j;
        boolean z = dvvVar.b() || dvvVar.e || dvvVar.c || dvvVar.d;
        ebx ebxVar = this.b;
        if (ebxVar.p) {
            if (z) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            if (ebxVar.g > 0) {
                throw new IllegalArgumentException("Expedited jobs cannot be delayed");
            }
        }
        String str = ebxVar.v;
        if (str == null) {
            List listA = ujp.A(ebxVar.c, new String[]{"."});
            String strD = listA.size() == 1 ? (String) listA.get(0) : (String) ske.bF(listA);
            if (strD.length() > 127) {
                strD = ujp.D(strD);
            }
            ebxVar.v = strD;
        } else if (str.length() > 127) {
            ebxVar.v = ujp.D(str);
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        this.a = uuidRandomUUID;
        String string = uuidRandomUUID.toString();
        string.getClass();
        ebx ebxVar2 = this.b;
        ebxVar2.getClass();
        this.b = new ebx(string, ebxVar2.x, ebxVar2.c, ebxVar2.d, new dvx(ebxVar2.e), new dvx(ebxVar2.f), ebxVar2.g, ebxVar2.h, ebxVar2.i, new dvv(ebxVar2.j), ebxVar2.k, ebxVar2.y, ebxVar2.l, ebxVar2.m, ebxVar2.n, ebxVar2.o, ebxVar2.p, ebxVar2.z, ebxVar2.q, ebxVar2.s, ebxVar2.t, ebxVar2.u, ebxVar2.v, ebxVar2.w, ImageMetadata.LENS_APERTURE);
        return tdyVarA;
    }
}
