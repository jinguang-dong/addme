package defpackage;

import android.util.Log;
import com.google.android.apps.camera.imax.cyclops.audio.xcIh.cdVQ;
import com.google.android.libraries.camera.exif.ExifInterface;
import com.google.common.io.ByteStreams;
import com.google.googlex.gcam.dirtylens.PrCd.TOnSyMaYeslEl;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pcy {
    private static final Charset h = Charset.forName("US-ASCII");
    private static final short i = ExifInterface.n(ExifInterface.B);
    private static final short j = ExifInterface.n(ExifInterface.C);
    private static final short k = ExifInterface.n(ExifInterface.al);
    private static final short l = ExifInterface.n(ExifInterface.D);
    private static final short m = ExifInterface.n(ExifInterface.E);
    private static final short n = ExifInterface.n(ExifInterface.i);
    private static final short o = ExifInterface.n(ExifInterface.m);
    public final pcq a;
    public int b;
    public pcz c;
    public pcx d;
    public pcz e;
    public pcz f;
    private boolean r;
    private boolean s;
    private int t;
    private byte[] u;
    private int v;
    private final ExifInterface w;
    private int p = 0;
    private int q = 0;
    public final TreeMap g = new TreeMap();

    public pcy(InputStream inputStream, ExifInterface exifInterface) throws pct, IOException {
        boolean z;
        this.s = false;
        this.w = exifInterface;
        pcq pcqVar = new pcq(inputStream);
        short sD = pcqVar.d();
        while (sD != -39 && !prh.M(sD)) {
            if (sD != -40) {
                int iB = pcqVar.b();
                if (sD == -31 && iB >= 8) {
                    int iA = pcqVar.a();
                    short sD2 = pcqVar.d();
                    iB -= 6;
                    if (iA == 1165519206 && sD2 == 0) {
                        this.t = iB;
                        z = true;
                        break;
                    }
                }
                if (iB >= 2) {
                    try {
                        ByteStreams.skipFully(pcqVar, iB - 2);
                        sD = pcqVar.d();
                    } catch (IOException unused) {
                    }
                }
                Log.w("CAM_ExifParser", "Invalid JPEG format.");
                break;
            }
            sD = pcqVar.d();
        }
        z = false;
        this.s = z;
        pcq pcqVar2 = new pcq(inputStream);
        this.a = pcqVar2;
        if (this.s) {
            short sD3 = pcqVar2.d();
            if (sD3 == 18761) {
                pcqVar2.e(ByteOrder.LITTLE_ENDIAN);
            } else {
                if (sD3 != 19789) {
                    throw new pct("Invalid TIFF header");
                }
                pcqVar2.e(ByteOrder.BIG_ENDIAN);
            }
            if (pcqVar2.d() != 42) {
                throw new pct("Invalid TIFF header");
            }
            long jC = pcqVar2.c();
            if (jC > 2147483647L) {
                throw new pct(mn.h(jC, "Invalid offset "));
            }
            int i2 = (int) jC;
            this.v = i2;
            this.b = 0;
            g(0, jC);
            if (jC != 8) {
                byte[] bArr = new byte[i2 - 8];
                this.u = bArr;
                b(bArr);
            }
        }
    }

    private final void f(pcz pczVar) {
        if (pczVar == null || pczVar.d == 0) {
            return;
        }
        short s = pczVar.a;
        int i2 = pczVar.e;
        if (s == i && h(i2, ExifInterface.B)) {
            g(2, pczVar.b(0));
            return;
        }
        if (s == j && h(i2, ExifInterface.C)) {
            g(4, pczVar.b(0));
            return;
        }
        if (s == k && h(i2, ExifInterface.al)) {
            g(3, pczVar.b(0));
            return;
        }
        if (s == l && h(i2, ExifInterface.D)) {
            this.g.put(Integer.valueOf((int) pczVar.b(0)), new pcx());
            return;
        }
        if (s == m && h(i2, ExifInterface.E)) {
            this.f = pczVar;
            return;
        }
        if (s != n || !h(i2, ExifInterface.i)) {
            if (s == o && h(i2, ExifInterface.m) && pczVar.e()) {
                this.e = pczVar;
                return;
            }
            return;
        }
        if (!pczVar.e()) {
            this.g.put(Integer.valueOf(pczVar.g), new pcv(pczVar, false));
            return;
        }
        for (int i3 = 0; i3 < pczVar.d; i3++) {
            this.g.put(Integer.valueOf((int) pczVar.b(i3)), new pcx(i3));
        }
    }

    private final void g(int i2, long j2) {
        this.g.put(Integer.valueOf((int) j2), new pcw(i2));
    }

    private final boolean h(int i2, int i3) {
        int i4 = this.w.h().get(i3);
        if (i4 == 0) {
            return false;
        }
        return ExifInterface.s(i4, i2);
    }

    public final int b(byte[] bArr) {
        return ByteStreams.read(this.a, bArr, 0, bArr.length);
    }

    protected final int c() {
        return this.a.a();
    }

    protected final long d() {
        return c() & 4294967295L;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(defpackage.pcz r10) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pcy.e(pcz):void");
    }

    public final int a() {
        int iIntValue;
        pcz pczVar;
        if (!this.s) {
            return 5;
        }
        pcq pcqVar = this.a;
        int i2 = pcqVar.a;
        int i3 = this.p + 2 + (this.q * 12);
        boolean z = true;
        if (i2 < i3) {
            short sD = pcqVar.d();
            short sD2 = pcqVar.d();
            long jC = pcqVar.c();
            if (jC > 2147483647L) {
                throw new pct("Number of component is larger then Integer.MAX_VALUE");
            }
            int i4 = pcz.h;
            if (sD2 == 1 || sD2 == 2 || sD2 == 3 || sD2 == 4 || sD2 == 5 || sD2 == 7 || sD2 == 9 || sD2 == 10) {
                int i5 = (int) jC;
                pcz pczVar2 = new pcz(sD, sD2, i5, this.b, i5 != 0);
                if (pczVar2.a() > 4) {
                    long jC2 = pcqVar.c();
                    if (jC2 > 2147483647L) {
                        throw new pct("offset is larger then Integer.MAX_VALUE");
                    }
                    if (jC2 >= this.v || sD2 != 7) {
                        pczVar2.g = (int) jC2;
                    } else {
                        byte[] bArr = new byte[i5];
                        System.arraycopy(this.u, ((int) jC2) - 8, bArr, 0, i5);
                        pczVar2.i(bArr);
                    }
                } else {
                    boolean z2 = pczVar2.c;
                    pczVar2.c = false;
                    e(pczVar2);
                    pczVar2.c = z2;
                    ByteStreams.skipFully(pcqVar, 4 - r2);
                    pczVar2.g = pcqVar.a - 4;
                }
                pczVar = pczVar2;
            } else {
                Log.w("CAM_ExifParser", String.format("Tag %04x: Invalid data type %d", Short.valueOf(sD), Short.valueOf(sD2)));
                ByteStreams.skipFully(pcqVar, 4L);
                pczVar = null;
            }
            this.c = pczVar;
            if (pczVar == null) {
                return a();
            }
            if (this.r) {
                f(pczVar);
            }
            return 1;
        }
        if (i2 == i3) {
            if (this.b == 0) {
                long jD = d();
                if (jD != 0) {
                    g(1, jD);
                }
            } else {
                TreeMap treeMap = this.g;
                if (treeMap.isEmpty()) {
                    iIntValue = 4;
                } else {
                    Map.Entry entryFirstEntry = treeMap.firstEntry();
                    entryFirstEntry.getClass();
                    iIntValue = ((Integer) entryFirstEntry.getKey()).intValue() - pcqVar.a;
                }
                if (iIntValue < 4) {
                    Log.w("CAM_ExifParser", a.bv(iIntValue, "Invalid size of link to next IFD: "));
                } else {
                    long jD2 = d();
                    if (jD2 != 0) {
                        Log.w("CAM_ExifParser", mn.h(jD2, "Invalid link to next IFD: "));
                    }
                }
            }
        }
        while (true) {
            TreeMap treeMap2 = this.g;
            if (treeMap2.isEmpty()) {
                return 5;
            }
            Map.Entry entryPollFirstEntry = treeMap2.pollFirstEntry();
            entryPollFirstEntry.getClass();
            Object value = entryPollFirstEntry.getValue();
            try {
                int iIntValue2 = ((Integer) entryPollFirstEntry.getKey()).intValue();
                ByteStreams.skipFully(pcqVar, iIntValue2 - pcqVar.a);
                while (!treeMap2.isEmpty() && ((Integer) treeMap2.firstKey()).intValue() < iIntValue2) {
                    treeMap2.pollFirstEntry();
                }
            } catch (IOException unused) {
                Log.w("CAM_ExifParser", "Failed to skip to data at: " + String.valueOf(entryPollFirstEntry.getKey()) + " for " + value.getClass().getName() + TOnSyMaYeslEl.lMAYmwfNsvkn);
            }
            if (value instanceof pcw) {
                pcw pcwVar = (pcw) value;
                this.b = pcwVar.a;
                this.q = this.a.b();
                int iIntValue3 = ((Integer) entryPollFirstEntry.getKey()).intValue();
                this.p = iIntValue3;
                if ((this.q * 12) + iIntValue3 + 2 > this.t) {
                    Log.w("CAM_ExifParser", cdVQ.nclCchOTyNlgDrN + this.b);
                    return 5;
                }
                int i6 = this.b;
                if (i6 != 0 && i6 != 1 && i6 != 2) {
                    z = false;
                }
                this.r = z;
                boolean z3 = pcwVar.b;
                return 0;
            }
            if (value instanceof pcx) {
                pcx pcxVar = (pcx) value;
                this.d = pcxVar;
                return pcxVar.b;
            }
            pcv pcvVar = (pcv) value;
            pcz pczVar3 = pcvVar.a;
            this.c = pczVar3;
            if (pczVar3 != null && pczVar3.b != 7) {
                e(pczVar3);
                f(this.c);
            }
            if (pcvVar.b) {
                return 2;
            }
        }
    }
}
