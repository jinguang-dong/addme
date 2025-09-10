package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.WindowInsets;
import com.google.android.apps.camera.legacy.app.app.CameraApp;
import com.google.android.apps.camera.optionsbar.view.OptionsPanelContent;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;
import j$.util.Collection;
import j$.util.Comparator$CC;
import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fvq implements rww {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ fvq(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r3v51, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r3v54, types: [java.lang.Object, tzj] */
    /* JADX WARN: Type inference failed for: r3v58, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r3v64, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v65, types: [java.lang.Object, rww] */
    /* JADX WARN: Type inference failed for: r3v72, types: [java.lang.Object, rww] */
    @Override // defpackage.rww
    public final Object fr() {
        int i = 0;
        switch (this.b) {
            case 0:
                return Boolean.valueOf(((fvu) this.a).g);
            case 1:
                return (Rect) this.a.dL();
            case 2:
                return ((hbj) this.a).a(gzo.K).get();
            case 3:
                gzi gziVar = gzo.a;
                return false;
            case 4:
                return ((CameraApp) this.a).f;
            case 5:
                return Boolean.valueOf(((jbe) this.a).c);
            case 6:
                return Boolean.valueOf(((ibb) this.a).j());
            case 7:
                WindowInsets rootWindowInsets = ((OptionsPanelContent) this.a).getRootWindowInsets();
                rootWindowInsets.getClass();
                return rootWindowInsets;
            case 8:
                Set setB = ((tzz) this.a).a();
                rnt.x(setB);
                return (scn) Collection.EL.stream(setB).map(new mcx(i)).collect(ryv.b);
            case 9:
                return (mxu) ((AtomicReference) this.a).get();
            case 10:
                return Boolean.valueOf(((ShutterButton) this.a).b);
            case 11:
                lpa lpaVar = olk.a;
                File file = new File(lpa.w(((Context) this.a).getFilesDir(), "wearos_assets"));
                lpa lpaVar2 = olk.a;
                File file2 = new File(lpa.w(file, "streamtmp"));
                file2.mkdirs();
                File[] fileArrListFiles = file2.listFiles();
                if (fileArrListFiles != null) {
                    while (i < fileArrListFiles.length) {
                        fileArrListFiles[i].delete();
                        i++;
                    }
                }
                return file2;
            case 12:
                return ((Context) this.a).getSharedPreferences("primes", 0);
            case 13:
                return (Boolean) this.a.a();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return sbp.t(Comparator$CC.comparing(new qoi(4), Comparator$CC.reverseOrder()), (Iterable) this.a.a());
            case 15:
                return this.a.a();
            case 16:
                Context context = qxf.a;
                rcf rcfVar = new rcf();
                rcfVar.f = this.a;
                return rcfVar.a();
            case 17:
                Context context2 = qxf.a;
                return new qqe(new onm((Context) this.a));
            case 18:
                Context context3 = qxf.a;
                return new lat((List) this.a, Collections.EMPTY_LIST, Collections.EMPTY_LIST);
            case 19:
                Context context4 = qxf.a;
                return (qzx) ((rwg) this.a.fr()).a;
            default:
                return rwc.j(new qzx(((rcf) this.a).a));
        }
    }
}
