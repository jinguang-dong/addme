package defpackage;

import android.hardware.camera2.CaptureRequest;
import j$.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class khx implements tzt {
    private final /* synthetic */ int a;
    private final Object b;

    public khx(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r3v36, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v45, types: [java.lang.Object, tzx] */
    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.a) {
            case 0:
                return qpt.cj(((khp) this.b).a().a);
            case 1:
                owf owfVarCm = qpt.cm(CaptureRequest.CONTROL_MODE, ((khh) this.b).a());
                owfVarCm.getClass();
                return owfVarCm;
            case 2:
                owf owfVarCm2 = qpt.cm(CaptureRequest.CONTROL_AE_MODE, (owf) this.b.a());
                owfVarCm2.getClass();
                return owfVarCm2;
            case 3:
                ((khq) this.b).a();
                return qpt.cl();
            case 4:
                Set set = (Set) Collection.EL.stream(((khw) this.b).a()).map(new jkv(9)).map(new jkv(10)).flatMap(new jkv(11)).collect(ryv.b);
                set.getClass();
                return set;
            case 5:
                owf owfVarCm3 = qpt.cm(CaptureRequest.STATISTICS_FACE_DETECT_MODE, ((kin) this.b).a());
                owfVarCm3.getClass();
                return owfVarCm3;
            case 6:
                return ((ngw) this.b).c;
            case 7:
                return ((ngw) this.b).d;
            case 8:
                hbj hbjVar = (hbj) this.b.a();
                return Integer.valueOf(hbjVar.p(hae.k) ? 4098 : hbjVar.p(hae.l) ? 4099 : 257);
            case 9:
                return new kjg((kju) this.b.a());
            case 10:
                ((kku) this.b).a();
                return new kkw();
            case 11:
                return new kkx(((kku) this.b).a(), 1, null);
            default:
                return new kkx(((kku) this.b).a(), 0);
        }
    }
}
