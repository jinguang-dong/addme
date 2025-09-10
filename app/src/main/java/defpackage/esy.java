package defpackage;

import com.google.android.clockwork.common.wearable.wearmaterial.progressindicator.XlTc.IQwwK;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class esy implements eqi {
    private static final fat b = new fat(50);
    private final eqi c;
    private final eqi d;
    private final int e;
    private final int f;
    private final Class g;
    private final eqm h;
    private final eqq i;
    private final etl j;

    public esy(etl etlVar, eqi eqiVar, eqi eqiVar2, int i, int i2, eqq eqqVar, Class cls, eqm eqmVar) {
        this.j = etlVar;
        this.c = eqiVar;
        this.d = eqiVar2;
        this.e = i;
        this.f = i2;
        this.i = eqqVar;
        this.g = cls;
        this.h = eqmVar;
    }

    @Override // defpackage.eqi
    public final void a(MessageDigest messageDigest) {
        etl etlVar = this.j;
        byte[] bArr = (byte[]) etlVar.e(byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.e).putInt(this.f).array();
        this.d.a(messageDigest);
        this.c.a(messageDigest);
        messageDigest.update(bArr);
        eqq eqqVar = this.i;
        if (eqqVar != null) {
            eqqVar.a(messageDigest);
        }
        this.h.a(messageDigest);
        Class cls = this.g;
        fat fatVar = b;
        byte[] bytes = (byte[]) fatVar.g(cls);
        if (bytes == null) {
            bytes = cls.getName().getBytes(a);
            fatVar.h(cls, bytes);
        }
        messageDigest.update(bytes);
        etlVar.c(bArr);
    }

    @Override // defpackage.eqi
    public final boolean equals(Object obj) {
        if (obj instanceof esy) {
            esy esyVar = (esy) obj;
            if (this.f == esyVar.f && this.e == esyVar.e) {
                eqq eqqVar = this.i;
                eqq eqqVar2 = esyVar.i;
                char[] cArr = fax.a;
                if (a.ao(eqqVar, eqqVar2) && this.g.equals(esyVar.g) && this.c.equals(esyVar.c) && this.d.equals(esyVar.d) && this.h.equals(esyVar.h)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.eqi
    public final int hashCode() {
        int iHashCode = (this.c.hashCode() * 31) + this.d.hashCode();
        eqq eqqVar = this.i;
        int iHashCode2 = (((iHashCode * 31) + this.e) * 31) + this.f;
        if (eqqVar != null) {
            iHashCode2 = (iHashCode2 * 31) + eqqVar.hashCode();
        }
        return (((iHashCode2 * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public final String toString() {
        eqm eqmVar = this.h;
        eqq eqqVar = this.i;
        Class cls = this.g;
        eqi eqiVar = this.d;
        return "ResourceCacheKey{sourceKey=" + String.valueOf(this.c) + ", signature=" + String.valueOf(eqiVar) + IQwwK.UFJRYcgZCjnvOX + this.e + ", height=" + this.f + ", decodedResourceClass=" + String.valueOf(cls) + ", transformation='" + String.valueOf(eqqVar) + "', options=" + String.valueOf(eqmVar) + "}";
    }
}
