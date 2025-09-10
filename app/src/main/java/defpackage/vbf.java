package defpackage;

import android.net.http.ConnectionMigrationOptions;
import android.net.http.DnsOptions;
import android.net.http.HttpEngine;
import android.net.http.QuicOptions;
import com.google.googlex.gcam.dirtylens.PrCd.TOnSyMaYeslEl;
import j$.time.Duration;
import j$.time.TimeConversions;
import j$.util.DateRetargetClass;
import java.util.Date;
import java.util.Set;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ICronetEngineBuilder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vbf extends ICronetEngineBuilder {
    private static boolean a;
    private static boolean b;
    private final HttpEngine.Builder c;
    private int d = Integer.MIN_VALUE;

    public vbf(HttpEngine.Builder builder) {
        this.c = builder;
    }

    private static int a(int i) {
        int i2 = i - 1;
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                return 0;
            }
        }
        return i3;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder addPublicKeyPins(String str, Set set, boolean z, Date date) {
        this.c.addPublicKeyPins(str, set, z, TimeConversions.convert(DateRetargetClass.toInstant(date)));
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder addQuicHint(String str, int i, int i2) {
        this.c.addQuicHint(str, i, i2);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ExperimentalCronetEngine build() {
        return new vbh(this.c.build(), this.d);
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableBrotli(boolean z) {
        this.c.setEnableBrotli(z);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableHttp2(boolean z) {
        this.c.setEnableHttp2(z);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableHttpCache(int i, long j) {
        this.c.setEnableHttpCache(i, j);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableNetworkQualityEstimator(boolean z) {
        if (!b) {
            b = true;
        }
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
        this.c.setEnablePublicKeyPinningBypassForLocalTrustAnchors(z);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableQuic(boolean z) {
        this.c.setEnableQuic(z);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableSdch(boolean z) {
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final String getDefaultUserAgent() {
        return this.c.getDefaultUserAgent();
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
        if (!a) {
            a = true;
        }
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setStoragePath(String str) {
        this.c.setStoragePath(str);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setThreadPriority(int i) {
        if (i > 19 || i < -20) {
            throw new IllegalArgumentException("Thread priority invalid");
        }
        this.d = i;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setUserAgent(String str) {
        this.c.setUserAgent(str);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setExperimentalOptions(String str) {
        vdp vdpVar = new vdp(str);
        ConnectionMigrationOptions.Builder builder = new ConnectionMigrationOptions.Builder();
        builder.setDefaultNetworkMigration(a(vdpVar.k()));
        builder.setPathDegradationMigration(a(ujo.l((Boolean) vdpVar.f("QUIC", "allow_port_migration", null, Boolean.class))));
        int iJ = vdpVar.j();
        builder.setAllowNonDefaultNetworkUsage(a(iJ));
        if (iJ == 2) {
            builder.setPathDegradationMigration(a(2));
        }
        HttpEngine.Builder builder2 = this.c;
        builder2.setConnectionMigrationOptions(builder.build());
        DnsOptions.StaleDnsOptions.Builder builder3 = new DnsOptions.StaleDnsOptions.Builder();
        int iC = vdpVar.c();
        if (iC != -1) {
            builder3.setFreshLookupTimeout(TimeConversions.convert(Duration.ofMillis(iC)));
        }
        int iD = vdpVar.d();
        if (iD != -1) {
            builder3.setMaxExpiredDelay(TimeConversions.convert(Duration.ofMillis(iD)));
        }
        builder3.setAllowCrossNetworkUsage(a(vdpVar.l())).setUseStaleOnNameNotResolved(a(vdpVar.o()));
        DnsOptions.Builder builder4 = new DnsOptions.Builder();
        builder4.setUseHttpStackDnsResolver(a(vdpVar.i())).setStaleDns(a(vdpVar.m())).setStaleDnsOptions(builder3.build()).setPreestablishConnectionsToStaleDnsResults(a(ujo.l((Boolean) vdpVar.f("QUIC", "race_stale_dns_on_connection", null, Boolean.class)))).setPersistHostCache(a(vdpVar.n()));
        int iE = vdpVar.e();
        if (iE != -1) {
            builder4.setPersistHostCachePeriod(TimeConversions.convert(Duration.ofMillis(iE)));
        }
        builder2.setDnsOptions(builder4.build());
        QuicOptions.Builder builder5 = new QuicOptions.Builder();
        if (vdpVar.g() != null) {
            for (String str2 : vdpVar.g().split(",")) {
                builder5.addAllowedQuicHost(str2);
            }
        }
        int iB = vdpVar.b();
        if (iB != -1) {
            builder5.setInMemoryServerConfigsCacheSize(iB);
        }
        String str3 = (String) vdpVar.f("QUIC", TOnSyMaYeslEl.bBaaHD, null, String.class);
        if (str3 != null) {
            builder5.setHandshakeUserAgent(str3);
        }
        int iA = vdpVar.a();
        if (iA != -1) {
            builder5.setIdleConnectionTimeout(TimeConversions.convert(Duration.ofSeconds(iA)));
        }
        builder2.setQuicOptions(builder5.build());
        return this;
    }
}
