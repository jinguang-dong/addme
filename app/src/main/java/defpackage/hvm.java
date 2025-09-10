package defpackage;

import android.app.Activity;
import android.opengl.EGL14;
import android.util.Pair;
import com.google.googlex.gcam.RawReadView;
import com.google.googlex.gcam.base.OwningNativePointer;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.opengles.GL10;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hvm implements Runnable {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public hvm(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r6v22, types: [java.lang.Object, paq] */
    /* JADX WARN: Type inference failed for: r6v27, types: [java.lang.Object, paq] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                hvn hvnVar = (hvn) this.a;
                hvnVar.f.eglDestroySurface(hvnVar.c, hvnVar.e);
                hvnVar.f.eglDestroyContext(hvnVar.c, hvnVar.d);
                hvnVar.f.eglMakeCurrent(hvnVar.c, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
                hvnVar.e = null;
                hvnVar.d = null;
                hvnVar.c = null;
                EGL14.eglReleaseThread();
                return;
            case 1:
                Object obj = this.a;
                Object obj2 = ((hvn) obj).j;
                synchronized (obj2) {
                    if (((hvn) obj).c != null && ((hvn) obj).e != null) {
                        jxa jxaVar = ((hvn) obj).l;
                        GL10 gl10 = ((hvn) obj).g;
                        jej jejVar = jxaVar.r;
                        if (jejVar != null) {
                            jejVar.onDrawFrame(gl10);
                        }
                        ((hvn) obj).f.eglSwapBuffers(((hvn) obj).c, ((hvn) obj).e);
                        ((hvn) obj).h = false;
                    }
                    obj2.notifyAll();
                }
                return;
            case 2:
                Object obj3 = this.a;
                synchronized (obj3) {
                    obj3.notifyAll();
                }
                return;
            case 3:
                hwb hwbVar = (hwb) this.a;
                if (((Boolean) hwbVar.f.dL()).booleanValue()) {
                    hwbVar.b();
                    return;
                }
                return;
            case 4:
                ((hwj) this.a).c();
                return;
            case 5:
                ((hyf) this.a).c(1.0f);
                return;
            case 6:
                ((hyf) this.a).c(0.5f);
                return;
            case 7:
                Object obj4 = this.a;
                hyf hyfVar = (hyf) obj4;
                hyfVar.c(1.0f);
                synchronized (hyfVar.a) {
                    ((hyf) obj4).c = null;
                }
                return;
            case 8:
                hyi.c((pdk) ((Pair) this.a).first);
                return;
            case 9:
                this.a.close();
                return;
            case 10:
                ((OwningNativePointer) this.a).close();
                return;
            case 11:
                ((RawReadView) this.a).a();
                return;
            case 12:
                iel.i();
                return;
            case 13:
                this.a.close();
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((ovx) this.a).a(true);
                return;
            case 15:
                ((ovx) this.a).a(false);
                return;
            case 16:
                ((Activity) this.a).setRequestedOrientation(4);
                return;
            case 17:
                ((ijo) this.a).h(true, 1);
                return;
            case 18:
                ((ikj) this.a).c();
                return;
            case 19:
                ijo ijoVar = (ijo) this.a;
                ijoVar.b.close();
                ijoVar.m.close();
                return;
            default:
                ((ilc) this.a).f();
                return;
        }
    }

    public /* synthetic */ hvm(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
