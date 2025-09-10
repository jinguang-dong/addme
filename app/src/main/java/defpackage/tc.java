package defpackage;

import com.google.android.apps.camera.facemetadata.conversions.jni.HM.oUZhwRhE;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tc extends byi {
    public final pk a;
    private final String b;
    private final Integer c;
    private final uz d;
    private final Throwable e;
    private final uz f;
    private final uz g;
    private final uz h;
    private final int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc(String str, int i, Integer num, uz uzVar, Throwable th, uz uzVar2, uz uzVar3, uz uzVar4, pk pkVar) {
        super((char[]) null);
        str.getClass();
        this.b = str;
        this.i = i;
        this.c = num;
        this.d = uzVar;
        this.e = th;
        this.f = uzVar2;
        this.g = uzVar3;
        this.h = uzVar4;
        this.a = pkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tc)) {
            return false;
        }
        tc tcVar = (tc) obj;
        return a.ao(this.b, tcVar.b) && this.i == tcVar.i && a.ao(this.c, tcVar.c) && a.ao(this.d, tcVar.d) && a.ao(this.e, tcVar.e) && a.ao(this.f, tcVar.f) && a.ao(this.g, tcVar.g) && a.ao(this.h, tcVar.h) && a.ao(this.a, tcVar.a);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        int i = this.i;
        a.aQ(i);
        Integer num = this.c;
        int iHashCode2 = (((iHashCode + i) * 31) + (num == null ? 0 : num.hashCode())) * 31;
        uz uzVar = this.d;
        int iR = (iHashCode2 + (uzVar == null ? 0 : a.r(uzVar.a))) * 31;
        Throwable th = this.e;
        int iHashCode3 = (iR + (th == null ? 0 : th.hashCode())) * 31;
        uz uzVar2 = this.f;
        int iR2 = (iHashCode3 + (uzVar2 == null ? 0 : a.r(uzVar2.a))) * 31;
        uz uzVar3 = this.g;
        int iR3 = (iR2 + (uzVar3 == null ? 0 : a.r(uzVar3.a))) * 31;
        uz uzVar4 = this.h;
        int iR4 = (iR3 + (uzVar4 == null ? 0 : a.r(uzVar4.a))) * 31;
        pk pkVar = this.a;
        return iR4 + (pkVar != null ? pkVar.a : 0);
    }

    public final String toString() {
        return "CameraStateClosed(cameraId=" + ((Object) pp.a(this.b)) + ", cameraClosedReason=" + ((Object) kk.g(this.i)) + ", cameraRetryCount=" + this.c + ", cameraRetryDurationNs=" + this.d + ", cameraException=" + this.e + ", cameraOpenDurationNs=" + this.f + ", cameraActiveDurationNs=" + this.g + ", cameraClosingDurationNs=" + this.h + oUZhwRhE.whMgkU + this.a + ')';
    }
}
