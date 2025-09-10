package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.location.Location;
import com.google.googlex.gcam.BurstSpec;
import j$.util.Collection;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class idb implements rvu {
    private final /* synthetic */ int a;

    public /* synthetic */ idb(int i) {
        this.a = i;
    }

    @Override // defpackage.rvu
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return ((ggg) obj).a;
            case 1:
                return ((ggg) obj).a;
            case 2:
                dtp dtpVar = (dtp) obj;
                return Boolean.valueOf(dtpVar.equals(dtp.d) || dtpVar.equals(dtp.e));
            case 3:
                dtp dtpVar2 = (dtp) obj;
                return Boolean.valueOf(dtpVar2.equals(dtp.d) || dtpVar2.equals(dtp.e));
            case 4:
                sbp sbpVar = (sbp) obj;
                sbpVar.getClass();
                return ezh.I(sbpVar).map(new idv(9));
            case 5:
                return Integer.valueOf(((Integer) obj).intValue() - 2);
            case 6:
                return (kox) ((oww) ((kfg) obj).i().f).dL();
            case 7:
                AtomicInteger atomicInteger = new AtomicInteger(0);
                Collection.EL.stream((sbp) obj).findFirst().ifPresent(new ird(atomicInteger, 13));
                return Integer.valueOf(atomicInteger.get());
            case 8:
                return Boolean.valueOf(((lss) obj).m().equals(ltf.LONG_SHOT));
            case 9:
                return (Location) ((rwc) obj).f();
            case 10:
                return rwc.j((ttd) obj);
            case 11:
                return ((pdn) obj).i();
            case 12:
                kqw kqwVar = (kqw) obj;
                return qpt.ck(new pej(CaptureRequest.SCALER_CROP_REGION, kqwVar.a), new pej(CaptureRequest.LENS_FOCAL_LENGTH, Float.valueOf(kqwVar.c)));
            case 13:
                return Boolean.valueOf(((mxj) obj) != mxj.TABLET_LAYOUT);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return ((BurstSpec) obj).c();
            case 15:
                return ((ggg) obj).a;
            case 16:
                return new File((File) obj, "milk").getAbsolutePath();
            case 17:
                nmr nmrVar = (nmr) obj;
                sbv sbvVar = lit.f;
                return sbvVar.containsKey(nmrVar) ? (nmr) sbvVar.get(nmrVar) : nmrVar;
            case 18:
                int i = ((lja) obj).b;
                int i2 = liy.b;
                return Boolean.valueOf(i == 2 || i == 4);
            case 19:
                return Boolean.valueOf(((ljq) obj).c);
            default:
                return Boolean.valueOf(((lku) obj).b);
        }
    }
}
