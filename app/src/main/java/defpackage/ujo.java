package defpackage;

import android.net.http.CallbackException;
import android.net.http.HttpException;
import android.net.http.InlineExecutionProhibitedException;
import android.net.http.NetworkException;
import android.net.http.QuicException;
import com.google.android.apps.camera.ui.hotshot.yElM.PNlJufQ;
import java.nio.ByteBuffer;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.chromium.net.CronetException;
import org.chromium.net.UploadDataProvider;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ujo {
    public static final long a(long j) {
        return j < 0 ? uls.b : uls.a;
    }

    public static final CancellationException b(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static final Throwable c(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        ujk.f(runtimeException, th);
        return runtimeException;
    }

    public static final void d(uhf uhfVar, Throwable th) {
        if (th instanceof unn) {
            th = ((unn) th).a;
        }
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) uhfVar.get(CoroutineExceptionHandler.c);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(uhfVar, th);
            } else {
                ujk.o(uhfVar, th);
            }
        } catch (Throwable th2) {
            ujk.o(uhfVar, c(th, th2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(defpackage.urk r5, defpackage.url r6, defpackage.uhb r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof defpackage.urs
            if (r0 == 0) goto L13
            r0 = r7
            urs r0 = (defpackage.urs) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            urs r0 = new urs
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.a
            uhi r1 = defpackage.uhi.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            uka r5 = r0.c
            defpackage.rnt.aN(r7)     // Catch: java.lang.Throwable -> L29
            goto L4c
        L29:
            r6 = move-exception
            goto L51
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.rnt.aN(r7)
            uka r7 = new uka
            r7.<init>()
            uru r2 = new uru     // Catch: java.lang.Throwable -> L4e
            r4 = 0
            r2.<init>(r6, r7, r4)     // Catch: java.lang.Throwable -> L4e
            r0.c = r7     // Catch: java.lang.Throwable -> L4e
            r0.b = r3     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r5 = r5.gc(r2, r0)     // Catch: java.lang.Throwable -> L4e
            if (r5 != r1) goto L4c
            return r1
        L4c:
            r5 = 0
            return r5
        L4e:
            r5 = move-exception
            r6 = r5
            r5 = r7
        L51:
            java.lang.Object r5 = r5.a
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            boolean r7 = r(r6, r5)
            if (r7 != 0) goto L89
            uhf r7 = r0.q()
            azn r0 = defpackage.uol.c
            uhd r7 = r7.get(r0)
            uol r7 = (defpackage.uol) r7
            if (r7 == 0) goto L7a
            boolean r0 = r7.fZ()
            if (r0 != 0) goto L70
            goto L7a
        L70:
            java.util.concurrent.CancellationException r7 = r7.n()
            boolean r7 = r(r6, r7)
            if (r7 != 0) goto L89
        L7a:
            if (r5 != 0) goto L7d
            return r6
        L7d:
            boolean r7 = r6 instanceof java.util.concurrent.CancellationException
            if (r7 == 0) goto L85
            defpackage.ujk.f(r5, r6)
            throw r5
        L85:
            defpackage.ujk.f(r6, r5)
            throw r6
        L89:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ujo.e(urk, url, uhb):java.lang.Object");
    }

    public static final void g(uqz uqzVar, Throwable th) {
        if (th != null) {
            cancellationExceptionB = th instanceof CancellationException ? (CancellationException) th : null;
            if (cancellationExceptionB == null) {
                cancellationExceptionB = b("Channel was consumed, consumer had failed", th);
            }
        }
        uqzVar.s(cancellationExceptionB);
    }

    public static final Object h(upm upmVar, uiu uiuVar) {
        ujp.Q(upmVar, true, new unu(ung.f(upmVar.e.q()).h(upmVar.b, upmVar, ((umd) upmVar).a)));
        return ukc.W(upmVar, false, upmVar, uiuVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object i(long r7, defpackage.uiu r9, defpackage.uhb r10) {
        /*
            boolean r0 = r10 instanceof defpackage.upn
            if (r0 == 0) goto L13
            r0 = r10
            upn r0 = (defpackage.upn) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            upn r0 = new upn
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.a
            uhi r1 = defpackage.uhi.a
            int r2 = r0.b
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            uka r7 = r0.c
            defpackage.rnt.aN(r10)     // Catch: defpackage.upl -> L2a
            return r10
        L2a:
            r8 = move-exception
            goto L59
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            defpackage.rnt.aN(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L3e
            return r3
        L3e:
            uka r10 = new uka
            r10.<init>()
            r0.c = r10     // Catch: defpackage.upl -> L56
            r0.b = r4     // Catch: defpackage.upl -> L56
            upm r2 = new upm     // Catch: defpackage.upl -> L56
            r2.<init>(r7, r0)     // Catch: defpackage.upl -> L56
            r10.a = r2     // Catch: defpackage.upl -> L56
            java.lang.Object r7 = h(r2, r9)     // Catch: defpackage.upl -> L56
            if (r7 != r1) goto L55
            return r1
        L55:
            return r7
        L56:
            r7 = move-exception
            r8 = r7
            r7 = r10
        L59:
            uol r9 = r8.a
            java.lang.Object r7 = r7.a
            if (r9 != r7) goto L60
            return r3
        L60:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ujo.i(long, uiu, uhb):java.lang.Object");
    }

    public static void j(long j, String str) {
        if (j < 0) {
            throw new IllegalArgumentException(str);
        }
    }

    public static boolean k(double d, int i, int i2) {
        return d >= ((double) i) && d < ((double) i2);
    }

    public static int l(Boolean bool) {
        if (bool == null) {
            return 1;
        }
        return bool.booleanValue() ? 2 : 3;
    }

    public static void m(ByteBuffer byteBuffer) {
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("byteBuffer must be a direct ByteBuffer.");
        }
    }

    public static String n(int i) {
        switch (i) {
            case 0:
                return "NOT_STARTED";
            case 1:
                return "STARTED";
            case 2:
                return "REDIRECT_RECEIVED";
            case 3:
                return "AWAITING_FOLLOW_REDIRECT";
            case 4:
                return "AWAITING_READ";
            case 5:
                return "READING";
            case 6:
                return "ERROR";
            case 7:
                return "COMPLETE";
            case 8:
                return "CANCELLED";
            default:
                throw new IllegalArgumentException(a.bv(i, "Unknown state "));
        }
    }

    public static Object o(vca vcaVar, Class cls) throws Exception {
        try {
            return vcaVar.a();
        } catch (Exception e) {
            if (e instanceof InlineExecutionProhibitedException) {
                org.chromium.net.InlineExecutionProhibitedException inlineExecutionProhibitedException = new org.chromium.net.InlineExecutionProhibitedException();
                inlineExecutionProhibitedException.initCause(e);
                throw inlineExecutionProhibitedException;
            }
            if (e instanceof HttpException) {
                throw p(e);
            }
            if (cls.isInstance(e)) {
                throw e;
            }
            throw e;
        }
    }

    public static UploadDataProvider q(byte[] bArr, int i, int i2) {
        return new vay(ByteBuffer.wrap(bArr, i, i2).slice());
    }

    private static final boolean r(Throwable th, Throwable th2) {
        if (th2 == null) {
            return false;
        }
        boolean z = unf.b;
        if (z) {
            th2 = uwb.c(th2);
        }
        if (z) {
            th = uwb.c(th);
        }
        return a.ao(th2, th);
    }

    public static CronetException p(Exception exc) {
        if (exc instanceof HttpException) {
            return exc instanceof QuicException ? new vbk((QuicException) exc) : exc instanceof NetworkException ? new vbj((NetworkException) exc, false) : exc instanceof CallbackException ? new vbd((CallbackException) exc) : new vbi((HttpException) exc);
        }
        throw new IllegalArgumentException(PNlJufQ.CFJ, exc);
    }
}
