package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.util.Base64;
import java.io.File;
import java.net.IDN;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Pattern;
import org.chromium.net.ApiVersion;
import org.chromium.net.CronetEngine;
import org.chromium.net.ICronetEngineBuilder;
import org.chromium.net.impl.ImplVersion;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class vby extends ICronetEngineBuilder {
    static final int a;
    private static final Pattern m = Pattern.compile("^[0-9\\.]*$");
    protected final vcg b;
    public final Context c;
    public boolean d;
    public String e;
    public String f;
    public boolean g;
    public boolean h;
    public boolean i;
    public vbx j;
    public String k;
    public boolean l;
    private final vcd p;
    private final List n = new LinkedList();
    private final List o = new LinkedList();
    private int q = 20;

    static {
        a = Integer.parseInt(ApiVersion.getCronetVersion().split("\\.")[0]) < 59 ? 3 : 34;
    }

    public vby(Context context, vcd vcdVar) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        Context applicationContext = context.getApplicationContext();
        this.c = applicationContext;
        this.p = vcdVar;
        this.b = vch.a(applicationContext, vcdVar);
        try {
            this.g = true;
            this.h = true;
            this.i = false;
            b(0);
            this.l = false;
            this.d = true;
            g(jUptimeMillis, true);
        } catch (Throwable th) {
            g(jUptimeMillis, false);
            throw th;
        }
    }

    private final void g(long j, boolean z) {
        if (a >= 30) {
            return;
        }
        vcc vccVar = new vcc();
        vccVar.d = false;
        try {
            vccVar.h = 2;
            vccVar.g = Process.myUid();
            vccVar.f = new vcf(ImplVersion.getCronetVersion());
            vccVar.c = this.p;
            vccVar.e = new vcf(ApiVersion.getCronetVersion());
            vccVar.a = getLogCronetInitializationRef();
            vccVar.d = Boolean.valueOf(z);
        } finally {
            vccVar.b = (int) (SystemClock.uptimeMillis() - j);
            this.b.b(vccVar);
        }
    }

    final int a(int i) {
        int i2 = this.q;
        return i2 == 20 ? i : i2;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder addPublicKeyPins(String str, Set set, boolean z, Date date) {
        e(str, set, date);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder addQuicHint(String str, int i, int i2) {
        f(str);
        return this;
    }

    public final void b(int i) {
        vbx vbxVar;
        vbx vbxVar2 = vbx.DISABLED;
        if (i == 0) {
            vbxVar = vbx.DISABLED;
        } else if (i == 1) {
            vbxVar = vbx.MEMORY;
        } else if (i == 2) {
            vbxVar = vbx.DISK_NO_HTTP;
        } else {
            if (i != 3) {
                throw new IllegalArgumentException("Unknown public builder cache mode");
            }
            vbxVar = vbx.DISK;
        }
        if (vbxVar.e == 1 && this.f == null) {
            throw new IllegalArgumentException("Storage path must be set");
        }
        this.j = vbxVar;
    }

    public final void c(String str) {
        if (!new File(str).isDirectory()) {
            throw new IllegalArgumentException("Storage path must be set to existing directory");
        }
        this.f = str;
    }

    public final void d(int i) {
        if (i > 19 || i < -20) {
            throw new IllegalArgumentException("Thread priority invalid");
        }
        this.q = i;
    }

    public final void e(String str, Set set, Date date) {
        str.getClass();
        set.getClass();
        date.getClass();
        if (m.matcher(str).matches()) {
            throw new IllegalArgumentException(a.bw(str, "Hostname ", " is illegal. A hostname should not consist of digits and/or dots only."));
        }
        if (str.length() > 255) {
            throw new IllegalArgumentException(a.bw(str, "Hostname ", " is too long. The name of the host does not comply with RFC 1122 and RFC 1123."));
        }
        try {
            IDN.toASCII(str, 2);
            HashMap map = new HashMap();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                byte[] bArr = (byte[]) it.next();
                if (bArr == null || bArr.length != 32) {
                    throw new IllegalArgumentException("Public key pin is invalid");
                }
                map.put(Base64.encodeToString(bArr, 0), bArr);
            }
            List list = this.o;
            list.add(new ujo());
        } catch (IllegalArgumentException unused) {
            throw new IllegalArgumentException(a.bw(str, "Hostname ", " is illegal. The name of the host does not comply with RFC 1122 and RFC 1123."));
        }
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ ICronetEngineBuilder enableBrotli(boolean z) {
        this.i = z;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ ICronetEngineBuilder enableHttp2(boolean z) {
        this.h = z;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder enableHttpCache(int i, long j) {
        b(i);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ ICronetEngineBuilder enableNetworkQualityEstimator(boolean z) {
        this.l = z;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
        this.d = z;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ ICronetEngineBuilder enableQuic(boolean z) {
        this.g = z;
        return this;
    }

    public final void f(String str) {
        if (str.contains("/")) {
            throw new IllegalArgumentException("Illegal QUIC Hint Host: ".concat(String.valueOf(str)));
        }
        this.n.add(new ujo());
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final String getDefaultUserAgent() {
        int i;
        StringBuilder sb = new StringBuilder();
        Context context = this.c;
        sb.append(context.getPackageName());
        sb.append('/');
        synchronized (vdj.a) {
            i = vdj.b;
            if (i == 0) {
                try {
                    i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                    vdj.b = i;
                } catch (PackageManager.NameNotFoundException unused) {
                    throw new IllegalStateException("Cannot determine package version");
                }
            }
        }
        sb.append(i);
        sb.append(" (Linux; U; Android ");
        sb.append(Build.VERSION.RELEASE);
        sb.append("; ");
        sb.append(Locale.getDefault().toString());
        String str = Build.MODEL;
        if (str.length() > 0) {
            sb.append("; ");
            sb.append(str);
        }
        String str2 = Build.ID;
        if (str2.length() > 0) {
            sb.append("; Build/");
            sb.append(str2);
        }
        sb.append("; Cronet/");
        sb.append(ImplVersion.getCronetVersion());
        sb.append(')');
        return sb.toString();
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    protected long getLogCronetInitializationRef() {
        return 0L;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ ICronetEngineBuilder setExperimentalOptions(String str) {
        this.k = str;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder setStoragePath(String str) {
        c(str);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder setThreadPriority(int i) {
        d(i);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ ICronetEngineBuilder setUserAgent(String str) {
        this.e = str;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder enableSdch(boolean z) {
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
        return this;
    }
}
