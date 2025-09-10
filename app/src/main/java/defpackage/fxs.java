package defpackage;

import android.content.Context;
import android.os.SystemClock;
import com.google.ar.core.R;
import java.util.Deque;
import java.util.Iterator;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class fxs implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ fxs(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                Object obj = this.a;
                synchronized (((fxy) obj).e) {
                    if (((fxy) obj).D == fxx.STARTING_RECORDING) {
                        gdv gdvVar = ((fxy) obj).E;
                        gdvVar.getClass();
                        gdvVar.a.q();
                        gcz gczVar = ((fxy) obj).n;
                        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
                        synchronized (gczVar) {
                            Deque deque = gczVar.b;
                            seo seoVar = (seo) deque.removeLast();
                            deque.add(seo.e((Long) seoVar.h(), Long.valueOf(jElapsedRealtimeNanos)));
                            gczVar.a += jElapsedRealtimeNanos - ((Long) seoVar.h()).longValue();
                        }
                        ((fxy) obj).f.f();
                        if (((fxy) obj).j.F) {
                            ((fxy) obj).s.c(true);
                        }
                        ((fxy) obj).l(fxx.RECORDING);
                    }
                }
                return;
            case 1:
                fxy fxyVar = (fxy) this.a;
                fxyVar.k("Recording in progress.");
                Iterator it = fxyVar.z.iterator();
                while (it.hasNext()) {
                    fxyVar.t.l(((lte) it.next()).b, null);
                }
                return;
            case 2:
                ((fyb) this.a).a.a();
                return;
            case 3:
                ((fyd) this.a).q.c();
                return;
            case 4:
                ((fyd) this.a).q.k();
                return;
            case 5:
                fyd fydVar = (fyd) this.a;
                fydVar.q.d();
                fydVar.p.a();
                fydVar.k(true);
                return;
            case 6:
                ((fyd) this.a).q.h();
                return;
            case 7:
                Object obj2 = this.a;
                synchronized (((fyk) obj2).e) {
                    ((fyk) obj2).b.b(((fyk) obj2).c);
                }
                return;
            case 8:
                Object obj3 = this.a;
                synchronized (((fyk) obj3).e) {
                    ((fyk) obj3).b.c(((fyk) obj3).c);
                    szh szhVar = ((fyk) obj3).d;
                    if (szhVar != null) {
                        szhVar.e(null);
                    }
                }
                return;
            case 9:
                szh szhVar2 = ((fyl) this.a).b;
                if (szhVar2 != null) {
                    szhVar2.e(null);
                    return;
                }
                return;
            case 10:
                ((mlw) this.a).m(mlv.TOUCH_TO_FOCUS);
                return;
            case 11:
                fyq fyqVar = ((fyp) this.a).b;
                ((mlw) fyqVar.b.c()).m(mlv.TOUCH_TO_FOCUS);
                fyqVar.l.o(eoz.e());
                return;
            case 12:
                fyq fyqVar2 = ((fyp) this.a).b;
                ((mlw) fyqVar2.b.c()).m(mlv.TOUCH_TO_FOCUS);
                fyqVar2.l.o(eoz.c());
                return;
            case 13:
                fyq fyqVar3 = (fyq) this.a;
                fyqVar3.g.e(null);
                fyqVar3.a.c(fyqVar3.j);
                fyqVar3.o.x(gdo.FOCUS_SESSION);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                fyq fyqVar4 = (fyq) this.a;
                fyqVar4.a.c(fyqVar4.k);
                fyqVar4.i = true;
                return;
            case 15:
                fze fzeVar = (fze) this.a;
                fzeVar.f(fzeVar.f);
                return;
            case 16:
                ((fze) ((fzp) this.a).a).e.e(true);
                return;
            case 17:
                fzs fzsVar = (fzs) this.a;
                fzsVar.d(fzsVar.f);
                return;
            case 18:
                ((gal) this.a).d.c();
                return;
            case 19:
                gbb gbbVar = (gbb) this.a;
                dv dvVar = gbbVar.d;
                if (dvVar == null || !dvVar.isShowing()) {
                    return;
                }
                gbbVar.d.dismiss();
                return;
            default:
                Object obj4 = this.a;
                fdf fdfVar = new fdf(obj4, 3);
                gbb gbbVar2 = (gbb) obj4;
                ocq ocqVar = gbbVar2.f;
                Context context = (Context) ocqVar.a;
                gbbVar2.d = ocq.af(ocqVar.ab(context.getResources().getString(R.string.video_storage_full_error_recording_dialog_title), context.getResources().getString(R.string.video_storage_max_duration_dialog_body), fdfVar));
                gbbVar2.a();
                return;
        }
    }

    public fxs(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
