package defpackage;

import android.content.pm.ResolveInfo;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import com.google.android.apps.camera.ui.hotshot.HotshotController;
import com.google.android.apps.camera.ui.hotshot.HotshotView;
import j$.util.Objects;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class mdn implements Predicate {
    private final /* synthetic */ int a;

    public /* synthetic */ mdn(int i) {
        this.a = i;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.a) {
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate */
    public final /* synthetic */ Predicate mo32negate() {
        switch (this.a) {
        }
        return Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.a) {
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return Objects.nonNull(obj);
            case 1:
                Pattern pattern = mbc.a;
                String str = ((ResolveInfo) obj).activityInfo.packageName;
                throw null;
            case 2:
                return ((szh) obj).isDone();
            case 3:
                return ((rwc) obj).h();
            case 4:
                muz muzVar = ((mwk) obj).a.a;
                sgv sgvVar = HotshotController.a;
                return muzVar.a() && muzVar.equals(muz.FACE);
            case 5:
                return ((mwl) obj).b;
            case 6:
                sgv sgvVar2 = HotshotView.a;
                return ((mwk) obj).a.a.a();
            case 7:
                return ((Boolean) ((npf) obj).a.b.dL()).booleanValue();
            case 8:
                return ((oyz) obj).b() == oym.FRAME_METADATA;
            case 9:
                return Objects.nonNull((CaptureResult) obj);
            case 10:
                return Objects.nonNull((TotalCaptureResult) obj);
            case 11:
                return true;
            case 12:
                return Objects.nonNull((tek) obj);
            case 13:
                return ((tek) obj).c != 6;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return ((tek) obj).c == 6;
            case 15:
                return Objects.nonNull((tel) obj);
            case 16:
                return ((tel) obj).e.dO() == fnt.TRACKING;
            case 17:
                return ((tfc) obj) != tfc.NONE;
            default:
                return ((tel) obj).e.dO() == fnt.TRACKING;
        }
    }
}
