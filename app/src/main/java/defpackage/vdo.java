package defpackage;

import android.os.Process;
import android.os.SystemClock;
import android.os.Trace;
import android.util.StatsEvent;
import android.util.StatsLog;
import j$.util.concurrent.ThreadLocalRandom;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vdo extends vcg {
    private final AtomicInteger a;
    private final vdr b;

    public vdo() {
        vdr vdrVar = new vdr();
        this.a = new AtomicInteger();
        this.b = vdrVar;
    }

    private static int e(vcd vcdVar) {
        int iOrdinal = vcdVar.ordinal();
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3) {
                    return 0;
                }
            }
        }
        return i;
    }

    @Override // defpackage.vcg
    public final long a() {
        long jNextLong = ThreadLocalRandom.current().nextLong(-9223372036854775807L, 9223372036854775805L);
        return jNextLong >= -1 ? jNextLong + 2 : jNextLong;
    }

    @Override // defpackage.vcg
    public final void b(vcc vccVar) {
        int i = 3;
        new jps("CronetLoggerImpl#logCronetEngineBuilderInitializedInfo", 3, null);
        try {
            long j = vccVar.a;
            int i2 = vccVar.h;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            int i4 = i3 != 0 ? i3 != 1 ? 0 : 2 : 1;
            int i5 = vccVar.b;
            int iOrdinal = vccVar.c.ordinal();
            if (iOrdinal == 1) {
                i = 1;
            } else if (iOrdinal == 2) {
                i = 2;
            } else if (iOrdinal != 3) {
                i = 4;
                if (iOrdinal != 4) {
                    i = 0;
                }
            }
            int i6 = -1;
            int iL = ujo.l(vccVar.d) - 1;
            vcf vcfVar = vccVar.e;
            int i7 = vcfVar.a;
            int i8 = vcfVar.b;
            int i9 = vcfVar.c;
            int i10 = vcfVar.d;
            vcf vcfVar2 = vccVar.f;
            int i11 = vcfVar2 == null ? -1 : vcfVar2.a;
            int i12 = vcfVar2 == null ? -1 : vcfVar2.b;
            if (vcfVar2 != null) {
                i6 = vcfVar2.c;
            }
            int i13 = vcfVar2 == null ? -1 : vcfVar2.d;
            int i14 = vccVar.g;
            StatsEvent.Builder builderNewBuilder = StatsEvent.newBuilder();
            builderNewBuilder.setAtomId(762);
            builderNewBuilder.writeLong(j);
            builderNewBuilder.writeInt(i4);
            builderNewBuilder.writeInt(i5);
            builderNewBuilder.writeInt(i);
            builderNewBuilder.writeInt(iL);
            builderNewBuilder.writeInt(i7);
            builderNewBuilder.writeInt(i8);
            builderNewBuilder.writeInt(i9);
            builderNewBuilder.writeInt(i10);
            builderNewBuilder.writeInt(i11);
            builderNewBuilder.writeInt(i12);
            builderNewBuilder.writeInt(i6);
            builderNewBuilder.writeInt(i13);
            builderNewBuilder.writeInt(i14);
            builderNewBuilder.addBooleanAnnotation((byte) 1, true);
            builderNewBuilder.usePooledBuffer();
            StatsLog.write(builderNewBuilder.build());
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

    @Override // defpackage.vcg
    public final void c(long j, vcb vcbVar, vcf vcfVar, vcd vcdVar) {
        boolean z;
        int i;
        Object objCast;
        if (vcdVar == null) {
            return;
        }
        try {
            int i2 = 3;
            new jps("CronetLoggerImpl#writeCronetEngineCreation", 3, null);
            try {
                vdp vdpVar = new vdp(vcbVar.f);
                int i3 = vcfVar.a;
                int i4 = vcfVar.b;
                int i5 = vcfVar.c;
                int i6 = vcfVar.d;
                int iE = e(vcdVar);
                boolean z2 = vcbVar.d;
                boolean z3 = vcbVar.c;
                int i7 = vcbVar.e;
                if (i7 == 0) {
                    i2 = 1;
                } else if (i7 == 1) {
                    i2 = 2;
                } else if (i7 != 2) {
                    i2 = 4;
                }
                boolean z4 = vcbVar.a;
                boolean z5 = vcbVar.b;
                boolean z6 = vcbVar.g;
                int i8 = vcbVar.h;
                String string = (String) vdpVar.f("QUIC", "connection_options", null, String.class);
                if (vdp.h(string)) {
                    z = z4;
                    i = -1;
                } else {
                    ArrayList arrayList = new ArrayList();
                    String[] strArrSplit = string.split(",", -1);
                    i = -1;
                    int length = strArrSplit.length;
                    int i9 = 0;
                    while (i9 < length) {
                        int i10 = i9;
                        String str = strArrSplit[i10];
                        int i11 = length;
                        boolean z7 = z4;
                        if (vdp.a.contains(str.toUpperCase(Locale.ROOT).trim())) {
                            arrayList.add(str);
                        }
                        i9 = i10 + 1;
                        length = i11;
                        z4 = z7;
                    }
                    z = z4;
                    StringBuilder sb = new StringBuilder();
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        Object next = it.next();
                        while (true) {
                            sb.append((CharSequence) next);
                            if (!it.hasNext()) {
                                break;
                            }
                            sb.append((CharSequence) ",");
                            next = it.next();
                        }
                    }
                    string = sb.toString();
                }
                int iL = ujo.l((Boolean) vdpVar.f("QUIC", "store_server_configs_in_properties", null, Boolean.class)) - 1;
                int iB = vdpVar.b();
                int iA = vdpVar.a();
                int iL2 = ujo.l((Boolean) vdpVar.f("QUIC", "goaway_sessions_on_ip_change", null, Boolean.class)) - 1;
                int iL3 = ujo.l((Boolean) vdpVar.f("QUIC", "close_sessions_on_ip_change", null, Boolean.class)) - 1;
                int iK = vdpVar.k() - 1;
                int iJ = vdpVar.j() - 1;
                int iL4 = ujo.l((Boolean) vdpVar.f("QUIC", "disable_bidirectional_streams", null, Boolean.class)) - 1;
                Integer numValueOf = Integer.valueOf(i);
                int iIntValue = ((Integer) vdpVar.f("QUIC", "max_time_before_crypto_handshake_seconds", numValueOf, Integer.class)).intValue();
                int iIntValue2 = ((Integer) vdpVar.f("QUIC", "max_idle_time_before_crypto_handshake_seconds", numValueOf, Integer.class)).intValue();
                int iL5 = ujo.l((Boolean) vdpVar.f("QUIC", "enable_socket_recv_optimization", null, Boolean.class)) - 1;
                int i12 = vdpVar.i() - 1;
                int iM = vdpVar.m() - 1;
                int iC = vdpVar.c();
                int iD = vdpVar.d();
                int iIntValue3 = ((Integer) vdpVar.f("StaleDNS", "max_stale_uses", numValueOf, Integer.class)).intValue();
                int iL6 = vdpVar.l() - 1;
                int iN = vdpVar.n() - 1;
                int iE2 = vdpVar.e();
                int iO = vdpVar.o() - 1;
                if (vdpVar.b.length() == 0) {
                    objCast = null;
                } else {
                    try {
                        objCast = Boolean.class.cast(vdpVar.b.get("disable_ipv6_on_wifi"));
                    } catch (ClassCastException | JSONException unused) {
                    }
                }
                int iL7 = ujo.l((Boolean) objCast) - 1;
                long j2 = vcbVar.i;
                int iMyUid = Process.myUid();
                StatsEvent.Builder builderNewBuilder = StatsEvent.newBuilder();
                builderNewBuilder.setAtomId(703);
                builderNewBuilder.writeLong(j);
                builderNewBuilder.writeInt(i3);
                builderNewBuilder.writeInt(i4);
                builderNewBuilder.writeInt(i5);
                builderNewBuilder.writeInt(i6);
                builderNewBuilder.writeInt(iE);
                builderNewBuilder.writeBoolean(z2);
                builderNewBuilder.writeBoolean(z3);
                builderNewBuilder.writeInt(i2);
                builderNewBuilder.writeBoolean(z);
                builderNewBuilder.writeBoolean(z5);
                builderNewBuilder.writeBoolean(z6);
                builderNewBuilder.writeInt(i8);
                builderNewBuilder.writeString(string);
                builderNewBuilder.writeInt(iL);
                builderNewBuilder.writeInt(iB);
                builderNewBuilder.writeInt(iA);
                builderNewBuilder.writeInt(iL2);
                builderNewBuilder.writeInt(iL3);
                builderNewBuilder.writeInt(iK);
                builderNewBuilder.writeInt(iJ);
                builderNewBuilder.writeInt(iL4);
                builderNewBuilder.writeInt(iIntValue);
                builderNewBuilder.writeInt(iIntValue2);
                builderNewBuilder.writeInt(iL5);
                builderNewBuilder.writeInt(i12);
                builderNewBuilder.writeInt(iM);
                builderNewBuilder.writeInt(iC);
                builderNewBuilder.writeInt(iD);
                builderNewBuilder.writeInt(iIntValue3);
                builderNewBuilder.writeInt(iL6);
                builderNewBuilder.writeInt(iN);
                builderNewBuilder.writeInt(iE2);
                builderNewBuilder.writeInt(iO);
                builderNewBuilder.writeInt(iL7);
                builderNewBuilder.writeLong(j2);
                builderNewBuilder.writeInt(iMyUid);
                builderNewBuilder.addBooleanAnnotation((byte) 1, true);
                builderNewBuilder.usePooledBuffer();
                StatsLog.write(builderNewBuilder.build());
                Trace.endSection();
            } finally {
            }
        } catch (Exception unused2) {
        }
    }

    @Override // defpackage.vcg
    public final void d(long j, vce vceVar) {
        boolean z;
        int i;
        int i2;
        byte[] bytes;
        vdr vdrVar = this.b;
        synchronized (vdrVar.a) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (vdrVar.c + 1000 <= jElapsedRealtime) {
                vdrVar.b = 1;
                vdrVar.c = jElapsedRealtime;
            } else {
                if (vdrVar.b > 0) {
                    this.a.incrementAndGet();
                    return;
                }
                vdrVar.b = 1;
            }
            int andSet = this.a.getAndSet(0);
            try {
                new jps("CronetLoggerImpl#writeCronetTrafficReported", 3, null);
                try {
                    long j2 = vceVar.a;
                    ujo.j(j2, "Request header size is negative");
                    double d = j2 / 1024.0d;
                    int i3 = ujo.k(d, 0, 1) ? 1 : ujo.k(d, 1, 10) ? 2 : ujo.k(d, 10, 25) ? 3 : ujo.k(d, 25, 50) ? 4 : ujo.k(d, 50, 100) ? 5 : 6;
                    ujo.j(-1L, "Request body size is negative");
                    int i4 = ujo.k(-9.765625E-4d, 10, 50) ? 3 : ujo.k(-9.765625E-4d, 50, 200) ? 4 : ujo.k(-9.765625E-4d, 200, 500) ? 5 : ujo.k(-9.765625E-4d, 500, 1000) ? 6 : ujo.k(-9.765625E-4d, 1000, 5000) ? 7 : 8;
                    long j3 = vceVar.b;
                    ujo.j(j3, "Response header size is negative");
                    double d2 = j3 / 1024.0d;
                    if (ujo.k(d2, 0, 1)) {
                        z = false;
                        i = i3;
                        i2 = 1;
                    } else if (ujo.k(d2, 1, 10)) {
                        z = false;
                        i = i3;
                        i2 = 2;
                    } else if (ujo.k(d2, 10, 25)) {
                        z = false;
                        i = i3;
                        i2 = 3;
                    } else if (ujo.k(d2, 25, 50)) {
                        z = false;
                        i = i3;
                        i2 = 4;
                    } else {
                        z = false;
                        i = i3;
                        i2 = ujo.k(d2, 50, 100) ? 5 : 6;
                    }
                    long j4 = vceVar.c;
                    ujo.j(j4, "Response body size is negative");
                    double d3 = j4 / 1024.0d;
                    int i5 = d3 == 0.0d ? 1 : (d3 <= 0.0d || d3 >= 10.0d) ? ujo.k(d3, 10, 50) ? 3 : ujo.k(d3, 50, 200) ? 4 : ujo.k(d3, 200, 500) ? 5 : ujo.k(d3, 500, 1000) ? 6 : ujo.k(d3, 1000, 5000) ? 7 : 8 : 2;
                    int i6 = vceVar.d;
                    String str = vceVar.g;
                    MessageDigest messageDigest = vdq.a;
                    long j5 = 0;
                    if (messageDigest != null && str != null && !str.isEmpty() && (bytes = str.getBytes(StandardCharsets.UTF_8)) != null && bytes.length != 0) {
                        j5 = ByteBuffer.wrap(messageDigest.digest(bytes)).getLong();
                    }
                    boolean z2 = z;
                    int millis = (int) vceVar.e.toMillis();
                    int millis2 = (int) vceVar.f.toMillis();
                    int i7 = vceVar.n - 1;
                    int i8 = i7 != 0 ? i7 != 1 ? 3 : 2 : 1;
                    int i9 = vceVar.h;
                    int i10 = vceVar.i;
                    int i11 = vceVar.j;
                    Boolean boolValueOf = Boolean.valueOf(z2);
                    int i12 = i;
                    int iL = ujo.l(boolValueOf) - 1;
                    int iL2 = ujo.l(Boolean.valueOf(vceVar.k)) - 1;
                    int i13 = vceVar.l;
                    int iL3 = ujo.l(boolValueOf) - 1;
                    int iE = e(vceVar.m);
                    StatsEvent.Builder builderNewBuilder = StatsEvent.newBuilder();
                    builderNewBuilder.setAtomId(704);
                    builderNewBuilder.writeLong(j);
                    builderNewBuilder.writeInt(i12);
                    builderNewBuilder.writeInt(i4);
                    builderNewBuilder.writeInt(i2);
                    builderNewBuilder.writeInt(i5);
                    builderNewBuilder.writeInt(i6);
                    builderNewBuilder.writeLong(j5);
                    builderNewBuilder.writeInt(millis);
                    builderNewBuilder.writeInt(millis2);
                    builderNewBuilder.writeBoolean(z2);
                    builderNewBuilder.writeBoolean(z2);
                    builderNewBuilder.writeInt(andSet);
                    builderNewBuilder.writeInt(i8);
                    builderNewBuilder.writeInt(i9);
                    builderNewBuilder.writeLong(-1L);
                    builderNewBuilder.writeLong(-1L);
                    builderNewBuilder.writeInt(i10);
                    builderNewBuilder.writeInt(i11);
                    builderNewBuilder.writeInt(iL);
                    builderNewBuilder.writeInt(iL2);
                    builderNewBuilder.writeInt(i13);
                    builderNewBuilder.addBooleanAnnotation((byte) 1, true);
                    builderNewBuilder.writeInt(0);
                    builderNewBuilder.writeInt(0);
                    builderNewBuilder.writeInt(0);
                    builderNewBuilder.writeInt(0);
                    builderNewBuilder.writeInt(iL3);
                    builderNewBuilder.writeString("136.0.7091.2");
                    builderNewBuilder.writeInt(iE);
                    builderNewBuilder.usePooledBuffer();
                    StatsLog.write(builderNewBuilder.build());
                    Trace.endSection();
                } finally {
                }
            } catch (Exception unused) {
                this.a.addAndGet(andSet);
            }
        }
    }
}
