package defpackage;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.google.android.apps.camera.imax.cyclops.processing.NativeCaptureImpl;
import com.google.android.apps.camera.keepalive.ProcessGcService;
import com.google.android.libraries.vision.opengl.Texture;
import com.google.ar.core.R;
import j$.time.Duration;
import java.io.FileOutputStream;
import java.io.IOException;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ild implements Runnable {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ild(ile ileVar, int i) {
        this.b = i;
        this.a = ileVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object, jhh] */
    /* JADX WARN: Type inference failed for: r10v8, types: [imj, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() throws IOException {
        switch (this.b) {
            case 0:
                ile ileVar = (ile) this.a;
                Texture texture = ileVar.i;
                ila ilaVar = ileVar.h;
                int iMax = (int) Math.max(Math.round(Math.log((ilaVar.a * ilaVar.b) / 32400) / Math.log(4.0d)), 0.0d);
                int name = texture.getName();
                int width = texture.getWidth();
                int height = texture.getHeight();
                NativeCaptureImpl nativeCaptureImpl = (NativeCaptureImpl) ileVar.d;
                nativeCaptureImpl.initialize(name, width, height, iMax, nativeCaptureImpl.a, nativeCaptureImpl.b);
                break;
            case 1:
                ((ile) this.a).d.release();
                break;
            case 2:
                ?? r10 = this.a;
                ((imi) r10).c.k(r10);
                break;
            case 3:
                this.a.i();
                break;
            case 4:
                ((imi) this.a).j();
                break;
            case 5:
                this.a.a(true);
                break;
            case 6:
                this.a.a(false);
                break;
            case 7:
                ipk ipkVar = (ipk) this.a;
                ipkVar.v.setImageDrawable(ipkVar.a.getDrawable(R.drawable.ic_jupiter_24px));
                break;
            case 8:
                ((ipk) this.a).I.b = false;
                break;
            case 9:
                ipk ipkVar2 = (ipk) this.a;
                Drawable drawable = ((iqh) ipkVar2.q.dL()).equals(iqh.URANUS) ? ipkVar2.a.getDrawable(R.drawable.ic_uranus) : ipkVar2.a.getDrawable(R.drawable.ic_saturn);
                drawable.getClass();
                drawable.setTint(ojl.aK(ipkVar2.v));
                ipkVar2.v.setImageDrawable(drawable);
                break;
            case 10:
                ipk ipkVar3 = (ipk) this.a;
                Drawable drawable2 = ipkVar3.a.getDrawable(R.drawable.ic_jupiter);
                drawable2.getClass();
                drawable2.setTint(ojl.aK(ipkVar3.v));
                ipkVar3.v.setImageDrawable(drawable2);
                break;
            case 11:
                ipk ipkVar4 = (ipk) this.a;
                ipkVar4.v.setImageDrawable(ipkVar4.a.getDrawable(R.drawable.ic_jupiter_24px));
                break;
            case 12:
                ((pez) this.a).i();
                break;
            case 13:
                ((ipy) this.a).a();
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Object obj = this.a;
                long jNanoTime = System.nanoTime();
                irk irkVar = (irk) obj;
                irc ircVar = irkVar.k;
                ircVar.a = jNanoTime;
                ircVar.b = true;
                ircVar.a();
                irkVar.k(iqq.IDLE);
                irkVar.i();
                break;
            case 15:
                ((irs) this.a).g();
                break;
            case 16:
                Duration duration = irv.a;
                ((TextView) this.a).sendAccessibilityEvent(8);
                break;
            case 17:
                isl islVar = (isl) this.a;
                islVar.b = null;
                out.a();
                Activity activity = (Activity) islVar.a.get();
                if (activity != null) {
                    activity.finish();
                    break;
                }
                break;
            case 18:
                ProcessGcService processGcService = (ProcessGcService) this.a;
                if (!processGcService.d.d()) {
                    System.exit(1234);
                    break;
                } else {
                    processGcService.a(5);
                    break;
                }
            case 19:
                sgv sgvVar = ite.a;
                try {
                    ((FileOutputStream) this.a).close();
                    break;
                } catch (IOException e) {
                    ((sgt) ((sgt) ite.a.b().i(e)).M((char) 2307)).s("Could not close file.");
                    return;
                }
            default:
                ite iteVar = (ite) this.a;
                iteVar.d.close();
                iteVar.f.close();
                iteVar.c.close();
                iteVar.e.release();
                iteVar.b.shutdown();
                break;
        }
    }

    public /* synthetic */ ild(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
