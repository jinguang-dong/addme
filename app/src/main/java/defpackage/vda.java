package defpackage;

import android.net.TrafficStats;
import android.os.Trace;
import android.util.Log;
import com.google.android.apps.camera.debug.metrics.CYLp.GdpuLBytnYW;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.InlineExecutionProhibitedException;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vda extends ExperimentalUrlRequest {
    public static final String a = "vda";
    public final vcy b;
    public final Executor c;
    public final String d;
    public final boolean h;
    public final String i;
    public vdl j;
    public Executor k;
    public String m;
    public ReadableByteChannel n;
    public vdi o;
    public String p;
    public HttpURLConnection q;
    public final vcn r;
    public final int s;
    public final vcg t;
    public final long u;
    public int v;
    public int w;
    public boolean x;
    public vct y;
    public final Map e = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    public final List f = new ArrayList();
    public final AtomicInteger g = new AtomicInteger(0);
    private final AtomicBoolean z = new AtomicBoolean(false);
    public volatile int l = -1;

    public vda(vcn vcnVar, UrlRequest.Callback callback, final Executor executor, Executor executor2, String str, String str2, boolean z, boolean z2, int i, final boolean z3, final int i2, long j, String str3, ArrayList arrayList, UploadDataProvider uploadDataProvider, Executor executor3) {
        vdl vdlVar = null;
        new jps("Cronet JavaUrlRequest#JavaUrlRequest", 3, null);
        try {
            this.h = z;
            this.b = new vcy(this, callback, executor2);
            final int threadStatsTag = !z2 ? TrafficStats.getThreadStatsTag() : i;
            this.c = new vcz(new Executor() { // from class: vcu
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    String str4 = vda.a;
                    executor.execute(new vcv(threadStatsTag, z3, i2, runnable, 0));
                }
            });
            this.r = vcnVar;
            this.s = vcnVar.a;
            this.t = vcnVar.b;
            this.m = str;
            this.d = str2;
            this.u = j;
            if (!"OPTIONS".equalsIgnoreCase(str3) && !"GET".equalsIgnoreCase(str3) && !"HEAD".equalsIgnoreCase(str3) && !"POST".equalsIgnoreCase(str3) && !"PUT".equalsIgnoreCase(str3) && !"DELETE".equalsIgnoreCase(str3) && !"TRACE".equalsIgnoreCase(str3) && !"PATCH".equalsIgnoreCase(str3)) {
                throw new IllegalArgumentException("Invalid http method ".concat(str3));
            }
            this.i = str3;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                Map.Entry entry = (Map.Entry) arrayList.get(i3);
                String str4 = (String) entry.getKey();
                int i4 = 0;
                while (true) {
                    if (i4 < str4.length()) {
                        char cCharAt = str4.charAt(i4);
                        if (cCharAt != ',' && cCharAt != '/' && cCharAt != '{' && cCharAt != '}') {
                            switch (cCharAt) {
                                case '\'':
                                case '(':
                                case ')':
                                    break;
                                default:
                                    switch (cCharAt) {
                                        case ':':
                                        case ';':
                                        case '<':
                                        case '=':
                                        case '>':
                                        case '?':
                                        case '@':
                                            break;
                                        default:
                                            switch (cCharAt) {
                                                case '[':
                                                case '\\':
                                                case ']':
                                                    break;
                                                default:
                                                    if (Character.isISOControl(cCharAt) || Character.isWhitespace(cCharAt)) {
                                                        break;
                                                    } else {
                                                        i4++;
                                                    }
                                                    break;
                                            }
                                    }
                            }
                        }
                    } else if (!((String) entry.getValue()).contains("\r\n")) {
                        this.e.put((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                throw new IllegalArgumentException("Invalid header with headername: ".concat(String.valueOf((String) entry.getKey())));
            }
            if (uploadDataProvider != null) {
                if (!this.e.containsKey(GdpuLBytnYW.pzGu)) {
                    throw new IllegalArgumentException("Requests with upload data must have a Content-Type.");
                }
                vdlVar = new vdl(uploadDataProvider);
            }
            this.j = vdlVar;
            this.k = (executor3 == null || this.h) ? executor3 : new psi(executor3, 2);
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public final void a() {
        d(new smv(this, 12), "closeResponseChannel");
    }

    public final void b(CronetException cronetException) {
        AtomicInteger atomicInteger;
        int i;
        do {
            atomicInteger = this.g;
            i = atomicInteger.get();
            if (i == 0) {
                throw new IllegalStateException("Can't enter error state before start");
            }
            if (i == 6 || i == 7 || i == 8) {
                return;
            }
        } while (!atomicInteger.compareAndSet(i, 6));
        f();
        e();
        vcy vcyVar = this.b;
        vdi vdiVar = this.o;
        vcyVar.d.a();
        int i2 = 9;
        qej qejVar = new qej(vcyVar, (UrlResponseInfo) vdiVar, cronetException, i2);
        try {
            vcyVar.b(qejVar, "onFailed");
        } catch (InlineExecutionProhibitedException unused) {
            Executor executor = vcyVar.c;
            if (executor != null) {
                new jps("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnFallbackExecutor onFailed", 3, null);
                try {
                    executor.execute(new vcq(qejVar, i2));
                    Trace.endSection();
                } catch (Throwable th) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
    }

    public final void c(Throwable th) {
        b(new vbv("Exception received from UploadDataProvider", th));
    }

    @Override // org.chromium.net.UrlRequest
    public final void cancel() {
        int andSet = this.g.getAndSet(8);
        if (andSet == 1 || andSet == 2 || andSet == 3 || andSet == 4 || andSet == 5) {
            f();
            e();
            vcy vcyVar = this.b;
            vdi vdiVar = this.o;
            vcyVar.d.a();
            vcyVar.b(new vcq(vcyVar, vdiVar, 11), "onCanceled");
        }
    }

    public final void d(Runnable runnable, String str) {
        new jps("Cronet JavaUrlRequest#executeOnExecutor ".concat(str), 3, null);
        try {
            this.c.execute(new vcq(str, runnable, 6));
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void e() {
        if (this.j == null || !this.z.compareAndSet(false, true)) {
            return;
        }
        try {
            Executor executor = this.k;
            vdl vdlVar = this.j;
            vdlVar.getClass();
            executor.execute(new vcq(this, (vdb) new vcp(vdlVar, 2), 4));
        } catch (RejectedExecutionException e) {
            Log.e(a, "Exception when closing uploadDataProvider", e);
        }
    }

    public final void f() {
        d(new smv(this, 10), "fireDisconnect");
    }

    @Override // org.chromium.net.UrlRequest
    public final void followRedirect() {
        j(3, 1, new smv(this, 14, null));
    }

    public final void g() {
        this.l = 13;
        d(new vcq(this, (vdb) new vcp(this, 4), 3), "fireGetHeaders");
    }

    @Override // org.chromium.net.UrlRequest
    public final void getStatus(UrlRequest.StatusListener statusListener) {
        int i = this.g.get();
        int i2 = this.l;
        switch (i) {
            case 0:
            case 6:
            case 7:
            case 8:
                i2 = -1;
                break;
            case 1:
                break;
            case 2:
            case 3:
            case 4:
                i2 = 0;
                break;
            case 5:
                i2 = 14;
                break;
            default:
                throw new IllegalStateException(a.bv(i, "Switch is exhaustive: "));
        }
        this.b.b(new mzp(new vdn(statusListener), i2, 7), "sendStatus");
    }

    public final void h() {
        int i = 3;
        d(new vcq(this, (vdb) new vcp(this, i), i), "fireOpenConnection");
    }

    public final void i(String str, Exception exc) {
        Log.e(a, a.bw(str, "Exception in ", " method"), exc);
        this.x = true;
    }

    @Override // org.chromium.net.UrlRequest
    public final boolean isDone() {
        int i = this.g.get();
        return i == 7 || i == 6 || i == 8;
    }

    public final void j(int i, int i2, Runnable runnable) {
        AtomicInteger atomicInteger = this.g;
        if (!atomicInteger.compareAndSet(i, i2)) {
            int i3 = atomicInteger.get();
            if (i3 == 8 || i3 == 6) {
                return;
            }
            throw new IllegalStateException("Invalid state transition - expected " + ujo.n(i) + " but was " + ujo.n(i3));
        }
        new jps("Cronet JavaUrlRequest#transitionStates " + ujo.n(i) + " -> " + ujo.n(i2), 3, null);
        try {
            runnable.run();
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // org.chromium.net.UrlRequest
    public final void read(final ByteBuffer byteBuffer) {
        ujo.m(byteBuffer);
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("ByteBuffer is already full.");
        }
        j(4, 5, new vcq(this, new vdb() { // from class: vcw
            @Override // defpackage.vdb
            public final void a() throws IOException {
                int i;
                vda vdaVar = this.a;
                ReadableByteChannel readableByteChannel = vdaVar.n;
                ByteBuffer byteBuffer2 = byteBuffer;
                if (readableByteChannel != null) {
                    vdaVar.v++;
                    i = readableByteChannel.read(byteBuffer2);
                } else {
                    i = -1;
                }
                if (i != -1) {
                    vcy vcyVar = vdaVar.b;
                    vcyVar.a(new vcx(vcyVar, vdaVar.o, byteBuffer2, 1), "onReadCompleted");
                    return;
                }
                ReadableByteChannel readableByteChannel2 = vdaVar.n;
                if (readableByteChannel2 != null) {
                    readableByteChannel2.close();
                }
                if (vdaVar.g.compareAndSet(5, 7)) {
                    vdaVar.f();
                    vcy vcyVar2 = vdaVar.b;
                    vcyVar2.b(new vcq(vcyVar2, vdaVar.o, 8), "onSucceeded");
                }
            }
        }, 7));
    }

    @Override // org.chromium.net.UrlRequest
    public final void start() {
        this.l = 10;
        this.r.c.incrementAndGet();
        j(0, 1, new smv(this, 11));
    }
}
