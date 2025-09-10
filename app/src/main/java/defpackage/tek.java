package defpackage;

import com.google.android.apps.camera.facemetadata.conversions.jni.HM.oUZhwRhE;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tek implements paq {
    public final float a;
    public final foi b;
    public final int c;

    public tek() {
        throw null;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        this.b.b();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tek) {
            tek tekVar = (tek) obj;
            if (this.c == tekVar.c && this.b.equals(tekVar.b)) {
                if (Float.floatToIntBits(this.a) == Float.floatToIntBits(tekVar.a)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.c;
        a.aQ(i);
        return Float.floatToIntBits(this.a) ^ ((((i ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public tek(int i, foi foiVar, float f) {
        this.c = i;
        foiVar.getClass();
        this.b = foiVar;
        this.a = f;
    }

    public final String toString() {
        int i = this.c;
        return oUZhwRhE.fApOgBsptdCMFS + (i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "ESTIMATED_DEPTH" : "HIT_TEST_DEPTH" : "PLANE" : "POINT" : "DEPTH" : "UNKNOWN") + ", " + this.b.toString() + ", " + this.a + "}";
    }
}
