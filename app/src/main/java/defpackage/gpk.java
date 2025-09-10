package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.util.LruCache;
import com.google.android.apps.camera.camerafatalerror.CameraFatalErrorTrackerDatabase;
import com.google.android.apps.camera.cameravisionkit.NewQrGleamingView;
import com.google.android.apps.camera.coach.CameraCoachHudView;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class gpk implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ gpk(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r9v10, types: [grx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v56, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r9v57, types: [java.lang.Object, owq] */
    @Override // java.lang.Runnable
    public final void run() {
        ScheduledFuture scheduledFuture;
        ScheduledFuture scheduledFuture2;
        int i = 3;
        int i2 = 1;
        int i3 = 0;
        switch (this.b) {
            case 0:
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("google://lens"));
                intent.setPackage("com.google.android.googlequicksearchbox");
                qqq qqqVar = (qqq) this.a;
                if (((Context) qqqVar.e).getPackageManager().resolveActivity(intent, 0) != null) {
                    ((lqc) qqqVar.b).a(new gpm(qqqVar, intent));
                    return;
                } else {
                    ((iso) qqqVar.a).u();
                    return;
                }
            case 1:
                Object obj = this.a;
                CameraFatalErrorTrackerDatabase cameraFatalErrorTrackerDatabase = (CameraFatalErrorTrackerDatabase) ((got) obj).c;
                dei.a((dco) cameraFatalErrorTrackerDatabase.x().a, false, true, new dvj(4));
                dei.a((dco) cameraFatalErrorTrackerDatabase.w().c, false, true, new dvj(i));
                DesugarArrays.stream(gpf.values()).forEach(new fio(obj, 14));
                return;
            case 2:
                Intent intent2 = new Intent("com.google.android.apps.docs.SCAN_DOCUMENT");
                intent2.setPackage("com.google.android.apps.docs");
                ((lqc) ((qqq) this.a).b).c(intent2);
                return;
            case 3:
                this.a.b();
                return;
            case 4:
                ArrayList arrayList = new ArrayList();
                Object obj2 = this.a;
                synchronized (obj2) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    HashMap map = ((gqk) obj2).b;
                    arrayList.addAll((Collection) Collection.EL.stream(map.entrySet()).filter(new hdx(jElapsedRealtime, i2)).map(new gbm(i)).collect(Collectors.toList()));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        map.remove((Long) it.next());
                    }
                    scheduledFuture = null;
                    if (map.isEmpty() && (scheduledFuture2 = ((gqk) obj2).d) != null) {
                        ((gqk) obj2).d = null;
                        scheduledFuture = scheduledFuture2;
                    }
                }
                int size = arrayList.size();
                while (i3 < size) {
                    ((gqk) obj2).c.a((Long) arrayList.get(i3));
                    i3++;
                }
                gqk.b(scheduledFuture);
                return;
            case 5:
                NewQrGleamingView newQrGleamingView = ((gqq) this.a).b;
                newQrGleamingView.getClass();
                out.a();
                newQrGleamingView.b();
                newQrGleamingView.invalidate();
                newQrGleamingView.g.set(0, 0);
                newQrGleamingView.h.set(0, 0, 0, 0);
                newQrGleamingView.setVisibility(8);
                return;
            case 6:
                Object obj3 = this.a;
                synchronized (obj3) {
                    if (((gqx) obj3).c.isPresent()) {
                        return;
                    }
                    Optional optional = ((gqx) obj3).b;
                    ((gqx) obj3).b = Optional.empty();
                    optional.ifPresent(new gqw(i3));
                    return;
                }
            case 7:
                grd grdVar = (grd) this.a;
                if (SystemClock.elapsedRealtime() - grdVar.c > grdVar.b) {
                    grdVar.a.j();
                    grdVar.a();
                    return;
                }
                return;
            case 8:
                gri griVar = (gri) this.a;
                griVar.h.evictAll();
                ((LruCache) griVar.i.a).evictAll();
                return;
            case 9:
                ((our) this.a).close();
                return;
            case 10:
                Object obj4 = this.a;
                rvk rvkVar = rvk.a;
                gso gsoVar = (gso) obj4;
                gsoVar.d = rvkVar;
                gsoVar.c = rvkVar;
                return;
            case 11:
                ((gsz) this.a).d();
                return;
            case 12:
                ((gsz) this.a).d();
                return;
            case 13:
                ((gsz) this.a).j();
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((gsz) this.a).c();
                return;
            case 15:
                ((gsz) this.a).f();
                return;
            case 16:
                ((gsz) this.a).l();
                return;
            case 17:
                ((gsz) this.a).h();
                return;
            case 18:
                this.a.a(false);
                return;
            case 19:
                this.a.a(true);
                return;
            default:
                ((guj) ((CameraCoachHudView) this.a).b.c()).a();
                return;
        }
    }
}
