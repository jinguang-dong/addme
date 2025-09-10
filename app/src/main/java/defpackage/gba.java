package defpackage;

import android.R;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.google.android.apps.camera.imax.cyclops.audio.xcIh.cdVQ;
import j$.time.Duration;
import j$.util.function.Consumer$CC;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class gba implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ gba(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r0v14, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r8v23, types: [java.lang.Object, mua] */
    /* JADX WARN: Type inference failed for: r8v24, types: [java.lang.Object, mua] */
    /* JADX WARN: Type inference failed for: r8v36, types: [gbg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v37, types: [gbg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v51, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r8v54, types: [java.lang.Object, owq] */
    @Override // java.lang.Runnable
    public final void run() throws IOException {
        int i = 4;
        int i2 = 1;
        switch (this.b) {
            case 0:
                Object obj = this.a;
                fdf fdfVar = new fdf(obj, i);
                gbb gbbVar = (gbb) obj;
                gbbVar.d = gbbVar.f.ae(fdfVar);
                gbbVar.a();
                return;
            case 1:
                Object obj2 = this.a;
                fdf fdfVar2 = new fdf(obj2, i);
                gbb gbbVar2 = (gbb) obj2;
                gbbVar2.d = gbbVar2.f.ad(fdfVar2);
                gbbVar2.a();
                return;
            case 2:
                Object obj3 = this.a;
                gbb gbbVar3 = (gbb) obj3;
                dv dvVar = gbbVar3.d;
                if (dvVar != null) {
                    dvVar.setOnDismissListener(new fdx(obj3, 2));
                    if (dvVar.isShowing()) {
                        return;
                    }
                    dvVar.show();
                    TextView textView = (TextView) dvVar.findViewById(R.id.message);
                    textView.getClass();
                    textView.setMovementMethod(LinkMovementMethod.getInstance());
                    fqy fqyVar = gbbVar3.e;
                    if (fqyVar != null) {
                        fqyVar.m(false);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                Object obj4 = this.a;
                fdf fdfVar3 = new fdf(obj4, 3);
                gbb gbbVar4 = (gbb) obj4;
                ocq ocqVar = gbbVar4.f;
                Context context = (Context) ocqVar.a;
                gbbVar4.d = ocq.af(ocqVar.ab(context.getResources().getString(com.google.ar.core.R.string.video_storage_full_error_recording_dialog_title), context.getResources().getString(com.google.ar.core.R.string.video_storage_max_file_size_dialog_body), fdfVar3));
                gbbVar4.a();
                return;
            case 4:
                ((gbe) this.a).c(-1.0f);
                return;
            case 5:
                try {
                    FileOutputStream fileOutputStream = ((gby) this.a).c;
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                        return;
                    }
                    return;
                } catch (IOException e) {
                    ((sgt) ((sgt) gby.a.b().i(e)).M((char) 700)).s("Error closing MediaFile.");
                    return;
                }
            case 6:
                Object obj5 = this.a;
                try {
                    FileOutputStream fileOutputStream2 = ((gby) obj5).c;
                    if (fileOutputStream2 != null) {
                        fileOutputStream2.close();
                    }
                    ((gby) obj5).b.d();
                    return;
                } catch (IOException e2) {
                    ((sgt) ((sgt) gby.a.b().i(e2)).M((char) 698)).s(cdVQ.ooEBfqLlN);
                    return;
                }
            case 7:
                this.a.c();
                return;
            case 8:
                this.a.d();
                return;
            case 9:
                Object obj6 = this.a;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                gdk gdkVar = (gdk) obj6;
                gdm gdmVar = gdkVar.a;
                final long jA = gdmVar.d.a(timeUnit) + 10;
                gdmVar.b.E("/video_state_recording", jA);
                synchronized (obj6) {
                    final gdk gdkVar2 = (gdk) obj6;
                    ((gdk) obj6).a.e.ifPresentOrElse(new Consumer() { // from class: gdj
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void d(Object obj7) {
                            int iA = ((oxh) obj7).a();
                            long j = jA;
                            long millis = iA * Duration.ofSeconds(Duration.ofMillis(j).toSeconds()).toMillis();
                            gdm gdmVar2 = gdkVar2.a;
                            gdmVar2.a.j(j, iA);
                            if (iA != 1) {
                                gdmVar2.b.E("/video_state_recording_output", millis);
                            }
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    }, new hcv(obj6, jA, i2));
                }
                gdkVar.a.c(TimeUnit.MILLISECONDS.toSeconds(jA));
                return;
            case 10:
                gds gdsVar = (gds) this.a;
                if (gdsVar.e()) {
                    gdsVar.h.d(nav.RECORDING_EARLY_STOPPED);
                    return;
                }
                return;
            case 11:
                this.a.c(true);
                return;
            case 12:
                this.a.c(false);
                return;
            case 13:
                Object obj7 = this.a;
                ((gds) obj7).h.a(nav.RECORDING_EARLY_STOPPED);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((naw) this.a).d(nav.POOR_VIDEO_QUALITY);
                return;
            case 15:
                ((naw) this.a).a(nav.POOR_VIDEO_QUALITY);
                return;
            case 16:
                ((ghd) this.a).c();
                return;
            case 17:
                ((ghd) this.a).c();
                return;
            case 18:
                ((gko) this.a).e.a(true);
                return;
            case 19:
                ((gko) this.a).e.a(false);
                return;
            default:
                ((gkt) this.a).b();
                return;
        }
    }
}
