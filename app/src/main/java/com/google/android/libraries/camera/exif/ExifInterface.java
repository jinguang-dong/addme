package com.google.android.libraries.camera.exif;

import android.util.Log;
import android.util.SparseIntArray;
import com.google.ar.core.ImageMetadata;
import defpackage.a;
import defpackage.edv;
import defpackage.edw;
import defpackage.pap;
import defpackage.pcq;
import defpackage.pcr;
import defpackage.pcs;
import defpackage.pct;
import defpackage.pcv;
import defpackage.pcy;
import defpackage.pcz;
import defpackage.pda;
import defpackage.pdc;
import defpackage.pdg;
import defpackage.pqw;
import defpackage.prh;
import defpackage.rnt;
import defpackage.rwd;
import j$.util.DesugarTimeZone;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ExifInterface implements pcs {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final int H;
    public static final int I;
    public static final int J;
    public static final int K;
    public static final int L;
    public static final int M;
    public static final int N;
    public static final int O;
    public static final int P;
    public static final int Q;
    public static final int R;
    public static final int S;
    public static final int T;
    public static final int TAG_SOFTWARE;
    public static final int U;
    public static final int V;
    public static final int W;
    public static final int X;
    public static final int Y;
    public static final int Z;
    public static final int aA;
    public static final int aB;
    public static final int aC;
    public static final int aD;
    public static final int aE;
    public static final int aF;
    public static final int aG;
    public static final int aH;
    public static final int aI;
    public static final int aJ;
    public static final int aK;
    public static final int aL;
    public static final int aM;
    public static final int aN;
    public static final int aO;
    public static final int aP;
    public static final int aQ;
    public static final int aR;
    public static final int aS;
    public static final int aT;
    public static final int aU;
    public static final int aV;
    public static final int aW;
    public static final int aX;
    public static final int aY;
    public static final int aZ;
    public static final int aa;
    public static final int ab;
    public static final int ac;
    public static final int ad;
    public static final int ae;
    public static final int af;
    public static final int ag;
    public static final int ah;
    public static final int ai;
    public static final int aj;
    public static final int ak;
    public static final int al;
    public static final int am;
    public static final int an;
    public static final int ao;
    public static final int ap;
    public static final int aq;
    public static final int ar;
    public static final int as;
    public static final int at;
    public static final int au;
    public static final int av;
    public static final int aw;
    public static final int ax;
    public static final int ay;
    public static final int az;
    private static final HashSet bE;
    private static final Long bF;
    public static final int ba;
    public static final int bb;
    public static final int bc;
    public static final int bd;
    public static final int be;
    public static final int bf;
    public static final int bg;
    public static final int bh;
    public static final int bi;
    public static final int bj;
    public static final int bk;
    public static final int bl;
    public static final int bm;
    public static final int bn;
    public static final int bo;
    public static final int bp;
    public static final int bq;
    public static final int br;
    public static final int bs;
    public static final int bt;
    public static final int bu;
    public static final int bv;
    protected static final HashSet bw;
    public static final Long bx;
    public static final ByteOrder by;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final int m;
    public static final int n;
    public static final int o;
    public static final int p;
    public static final int q;
    public static final int r;
    public static final int s;
    public static final int t;
    public static final int u;
    public static final int v;
    public static final int w;
    public static final int x;
    public static final int y;
    public static final int z;
    public final DateFormat bC;
    public final Calendar bD;
    private SparseIntArray bH;
    public static final int a = c(0, 256);
    public static final int b = c(0, 257);
    public static final int c = c(0, 258);
    public static final int d = c(0, 259);
    public static final int e = c(0, 262);
    public static final int f = c(0, 270);
    public static final int g = c(0, 271);
    public static final int h = c(0, 272);
    public String bz = "";
    public String bA = "";
    public pcr bB = new pcr(by);
    private final DateFormat bG = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.ROOT);

    static {
        int iC = c(0, (short) 273);
        i = iC;
        j = c(0, (short) 274);
        k = c(0, (short) 277);
        l = c(0, (short) 278);
        int iC2 = c(0, (short) 279);
        m = iC2;
        n = c(0, (short) 282);
        o = c(0, (short) 283);
        p = c(0, (short) 284);
        q = c(0, (short) 296);
        r = c(0, (short) 301);
        TAG_SOFTWARE = c(0, (short) 305);
        s = c(0, (short) 306);
        t = c(0, (short) 315);
        u = c(0, (short) 318);
        v = c(0, (short) 319);
        w = c(0, (short) 529);
        x = c(0, (short) 530);
        y = c(0, (short) 531);
        z = c(0, (short) 532);
        A = c(0, (short) -32104);
        int iC3 = c(0, (short) -30871);
        B = iC3;
        int iC4 = c(0, (short) -30683);
        C = iC4;
        int iC5 = c(1, (short) 513);
        D = iC5;
        int iC6 = c(1, (short) 514);
        E = iC6;
        F = c(2, (short) -32102);
        G = c(2, (short) -32099);
        H = c(2, (short) -30686);
        I = c(2, (short) -30684);
        J = c(2, (short) -30681);
        K = c(2, (short) -30680);
        L = c(2, (short) -28672);
        M = c(2, (short) -28669);
        N = c(2, (short) -28668);
        O = c(2, (short) -28415);
        P = c(2, (short) -28414);
        Q = c(2, (short) -28159);
        R = c(2, (short) -28158);
        S = c(2, (short) -28157);
        T = c(2, (short) -28156);
        U = c(2, (short) -28155);
        V = c(2, (short) -28154);
        W = c(2, (short) -28153);
        X = c(2, (short) -28152);
        Y = c(2, (short) -28151);
        Z = c(2, (short) -28150);
        aa = c(2, (short) -28140);
        ab = c(2, (short) -28036);
        ac = c(2, (short) -28026);
        ad = c(2, (short) -28016);
        ae = c(2, (short) -28015);
        af = c(2, (short) -28014);
        ag = c(2, (short) -24576);
        ah = c(2, (short) -24575);
        ai = c(2, (short) -24574);
        aj = c(2, (short) -24573);
        ak = c(2, (short) -24572);
        int iC7 = c(2, (short) -24571);
        al = iC7;
        am = c(2, (short) -24053);
        an = c(2, (short) -24052);
        ao = c(2, (short) -24050);
        ap = c(2, (short) -24049);
        aq = c(2, (short) -24048);
        ar = c(2, (short) -24044);
        as = c(2, (short) -24043);
        at = c(2, (short) -24041);
        au = c(2, (short) -23808);
        av = c(2, (short) -23807);
        aw = c(2, (short) -23806);
        ax = c(2, (short) -23551);
        ay = c(2, (short) -23550);
        az = c(2, (short) -23549);
        aA = c(2, (short) -23548);
        aB = c(2, (short) -23547);
        aC = c(2, (short) -23546);
        aD = c(2, (short) -23545);
        aE = c(2, (short) -23544);
        aF = c(2, (short) -23543);
        aG = c(2, (short) -23542);
        aH = c(2, (short) -23541);
        aI = c(2, (short) -23540);
        aJ = c(2, (short) -23520);
        aK = c(2, (short) -23501);
        aL = c(2, (short) -23500);
        aM = c(2, (short) -28656);
        aN = c(2, (short) -28655);
        aO = c(2, (short) -28654);
        aP = c(2, (short) -27648);
        aQ = c(2, (short) -27645);
        aR = c(4, (short) 0);
        aS = c(4, (short) 1);
        aT = c(4, (short) 2);
        aU = c(4, (short) 3);
        aV = c(4, (short) 4);
        aW = c(4, (short) 5);
        aX = c(4, (short) 6);
        aY = c(4, (short) 7);
        aZ = c(4, (short) 8);
        ba = c(4, (short) 9);
        bb = c(4, (short) 10);
        bc = c(4, (short) 11);
        bd = c(4, (short) 12);
        be = c(4, (short) 13);
        bf = c(4, (short) 14);
        bg = c(4, (short) 15);
        bh = c(4, (short) 16);
        bi = c(4, (short) 17);
        bj = c(4, (short) 18);
        bk = c(4, (short) 19);
        bl = c(4, (short) 20);
        bm = c(4, (short) 23);
        bn = c(4, (short) 24);
        bo = c(4, (short) 25);
        bp = c(4, (short) 26);
        bq = c(4, (short) 27);
        br = c(4, (short) 28);
        bs = c(4, (short) 29);
        bt = c(4, (short) 30);
        bu = c(3, (short) 1);
        bv = c(3, (short) 2);
        HashSet hashSet = new HashSet();
        bE = hashSet;
        hashSet.add(Short.valueOf(n(iC4)));
        hashSet.add(Short.valueOf(n(iC3)));
        hashSet.add(Short.valueOf(n(iC5)));
        hashSet.add(Short.valueOf(n(iC7)));
        hashSet.add(Short.valueOf(n(iC)));
        HashSet hashSet2 = new HashSet(hashSet);
        bw = hashSet2;
        hashSet2.add(Short.valueOf(n(-1)));
        hashSet2.add(Short.valueOf(n(iC6)));
        hashSet2.add(Short.valueOf(n(iC2)));
        bx = 100L;
        bF = 100L;
        by = ByteOrder.BIG_ENDIAN;
    }

    public ExifInterface() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd", Locale.ROOT);
        this.bC = simpleDateFormat;
        this.bD = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
        this.bH = null;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
    }

    private static final String A(long j2) {
        return rnt.A(Long.toString(j2), 2);
    }

    public static int c(int i2, short s2) {
        return (i2 << 16) | ((char) s2);
    }

    protected static int d(int i2) {
        return (char) i2;
    }

    protected static int f(int[] iArr) {
        int[] iArr2 = pdc.a;
        int i2 = 0;
        for (int i3 = 0; i3 < 5; i3++) {
            int length = iArr.length;
            int i4 = 0;
            while (true) {
                if (i4 < length) {
                    if (iArr2[i3] == iArr[i4]) {
                        i2 |= 1 << i3;
                        break;
                    }
                    i4++;
                }
            }
        }
        return i2;
    }

    public static int g(int i2) {
        return i2 >>> 16;
    }

    public static short n(int i2) {
        return (short) i2;
    }

    protected static short o(int i2) {
        return (short) ((i2 >> 16) & 255);
    }

    public static boolean s(int i2, int i3) {
        int[] iArr = pdc.a;
        for (int i4 = 0; i4 < 5; i4++) {
            if (i3 == iArr[i4] && (((i2 >>> 24) >> i4) & 1) == 1) {
                return true;
            }
        }
        return false;
    }

    public static boolean t(short s2) {
        return bE.contains(Short.valueOf(s2));
    }

    public static pap[] w(double d2) {
        double dAbs = Math.abs(d2);
        int i2 = (int) dAbs;
        Long l2 = bF;
        l2.longValue();
        int i3 = (int) ((dAbs - i2) * 60.0d);
        l2.longValue();
        return new pap[]{new pap(i2, 1L), new pap(i3, 1L), new pap((int) ((r10 - i3) * 60.0d * 100.0d), 100L)};
    }

    private final void z(InputStream inputStream, InputStream inputStream2) throws IOException {
        rwd rwdVarE;
        try {
            pcy pcyVar = new pcy(inputStream, this);
            pcq pcqVar = pcyVar.a;
            pcr pcrVar = new pcr(pcqVar.b.order());
            for (int iA = pcyVar.a(); iA != 5; iA = pcyVar.a()) {
                if (iA == 0) {
                    pcrVar.d(new pdc(pcyVar.b));
                } else if (iA == 1) {
                    pcz pczVar = pcyVar.c;
                    if (pczVar != null) {
                        if (pczVar.e()) {
                            pdc pdcVarB = pcrVar.b(pczVar.e);
                            if (pdcVarB != null) {
                                pdcVarB.e(pczVar);
                            }
                        } else {
                            int i2 = pczVar.g;
                            if (i2 >= pcqVar.a) {
                                pcyVar.g.put(Integer.valueOf(i2), new pcv(pczVar, true));
                            }
                        }
                    }
                } else if (iA != 2) {
                    int iB = 0;
                    if (iA != 3) {
                        pcz pczVar2 = pcyVar.e;
                        if (pczVar2 != null) {
                            iB = (int) pczVar2.b(0);
                        }
                        byte[] bArr = new byte[iB];
                        if (iB == pcyVar.b(bArr)) {
                            int i3 = pcyVar.d.a;
                            ArrayList arrayList = pcrVar.c;
                            if (i3 < arrayList.size()) {
                                arrayList.set(i3, bArr);
                            } else {
                                for (int size = arrayList.size(); size < i3; size++) {
                                    arrayList.add(null);
                                }
                                arrayList.add(bArr);
                            }
                        } else {
                            Log.w("CAM_ExifReader", "Failed to read the strip bytes");
                        }
                    } else {
                        pcz pczVar3 = pcyVar.f;
                        if (pczVar3 != null) {
                            iB = (int) pczVar3.b(0);
                        }
                        byte[] bArr2 = new byte[iB];
                        if (iB == pcyVar.b(bArr2)) {
                            pcrVar.b = bArr2;
                        } else {
                            Log.w("CAM_ExifReader", "Failed to read the compressed thumbnail");
                        }
                    }
                } else {
                    pcz pczVar4 = pcyVar.c;
                    if (pczVar4 != null) {
                        if (pczVar4.b == 7) {
                            pcyVar.e(pczVar4);
                        }
                        pdc pdcVarB2 = pcrVar.b(pczVar4.e);
                        if (pdcVarB2 != null) {
                            pdcVarB2.e(pczVar4);
                        }
                    }
                }
            }
            this.bB = pcrVar;
            if (inputStream2 == null || (rwdVarE = pqw.e(inputStream2)) == null) {
                return;
            }
            try {
                String str = new String(pqw.g((edw) rwdVarE.a).array());
                String str2 = new String(pqw.g((edw) rwdVarE.b).array());
                this.bz = str;
                this.bA = str2;
            } catch (edv e2) {
                throw new IOException("Could not parse XMP data.", e2);
            }
        } catch (pct e3) {
            throw new IOException("Invalid exif format : ", e3);
        }
    }

    @Override // defpackage.pcs
    public final pap a(int i2) {
        pap[] papVarArrV = v(i2, e(i2));
        if (papVarArrV == null || papVarArrV.length == 0) {
            return null;
        }
        return new pap(papVarArrV[0]);
    }

    @Override // defpackage.pcs
    public final Integer b(int i2) {
        pcz pczVarL = l(i2, e(i2));
        int[] iArrM = pczVarL == null ? null : pczVarL.m();
        if (iArrM == null || iArrM.length <= 0) {
            return null;
        }
        return Integer.valueOf(iArrM[0]);
    }

    public final int e(int i2) {
        if (h().get(i2) == 0) {
            return -1;
        }
        return g(i2);
    }

    @Override // defpackage.pcs
    public String getTagStringValue(int i2) {
        pcz pczVarL = l(i2, e(i2));
        if (pczVarL == null) {
            return null;
        }
        return pczVarL.d();
    }

    public final SparseIntArray h() {
        if (this.bH == null) {
            this.bH = new SparseIntArray();
            int iF = f(new int[]{0, 1}) << 24;
            SparseIntArray sparseIntArray = this.bH;
            sparseIntArray.getClass();
            int i2 = g;
            int i3 = iF | 131072;
            sparseIntArray.put(i2, i3);
            int i4 = iF | 262145;
            sparseIntArray.put(a, i4);
            sparseIntArray.put(b, i4);
            sparseIntArray.put(c, 196611 | iF);
            int i5 = iF | 196609;
            sparseIntArray.put(d, i5);
            sparseIntArray.put(e, i5);
            sparseIntArray.put(j, i5);
            sparseIntArray.put(k, i5);
            sparseIntArray.put(p, i5);
            sparseIntArray.put(x, iF | 196610);
            sparseIntArray.put(y, i5);
            int i6 = iF | 327681;
            sparseIntArray.put(n, i6);
            sparseIntArray.put(o, i6);
            sparseIntArray.put(q, i5);
            int i7 = 262144 | iF;
            sparseIntArray.put(i, i7);
            sparseIntArray.put(l, i4);
            sparseIntArray.put(m, i7);
            sparseIntArray.put(r, 197376 | iF);
            sparseIntArray.put(u, 327682 | iF);
            int i8 = 327686 | iF;
            sparseIntArray.put(v, i8);
            sparseIntArray.put(w, iF | 327683);
            sparseIntArray.put(z, i8);
            sparseIntArray.put(s, iF | 131092);
            sparseIntArray.put(f, i3);
            sparseIntArray.put(i2, i3);
            sparseIntArray.put(h, i3);
            sparseIntArray.put(TAG_SOFTWARE, i3);
            sparseIntArray.put(t, i3);
            sparseIntArray.put(A, i3);
            sparseIntArray.put(B, i4);
            sparseIntArray.put(C, i4);
            int iF2 = (f(new int[]{1}) << 24) | 262145;
            sparseIntArray.put(D, iF2);
            sparseIntArray.put(E, iF2);
            int iF3 = f(new int[]{2}) << 24;
            int i9 = 458756 | iF3;
            sparseIntArray.put(L, i9);
            sparseIntArray.put(ag, i9);
            int i10 = iF3 | 196609;
            sparseIntArray.put(ah, i10);
            sparseIntArray.put(O, i9);
            int i11 = iF3 | 327681;
            sparseIntArray.put(P, i11);
            int i12 = iF3 | 262145;
            sparseIntArray.put(ai, i12);
            sparseIntArray.put(aj, i12);
            int i13 = ab;
            int i14 = iF3 | ImageMetadata.JPEG_GPS_COORDINATES;
            sparseIntArray.put(i13, i14);
            sparseIntArray.put(ac, i14);
            sparseIntArray.put(ak, 131085 | iF3);
            int i15 = iF3 | 131092;
            sparseIntArray.put(M, i15);
            sparseIntArray.put(N, i15);
            int i16 = iF3 | 131072;
            sparseIntArray.put(ad, i16);
            sparseIntArray.put(ae, i16);
            sparseIntArray.put(af, i16);
            sparseIntArray.put(aJ, 131105 | iF3);
            sparseIntArray.put(aK, i16);
            sparseIntArray.put(aL, i16);
            sparseIntArray.put(F, i11);
            sparseIntArray.put(G, i11);
            sparseIntArray.put(H, i10);
            sparseIntArray.put(I, i16);
            int i17 = 196608 | iF3;
            sparseIntArray.put(J, i17);
            sparseIntArray.put(K, i14);
            int i18 = 655361 | iF3;
            sparseIntArray.put(Q, i18);
            sparseIntArray.put(R, i11);
            sparseIntArray.put(S, i18);
            sparseIntArray.put(T, i18);
            sparseIntArray.put(U, i11);
            sparseIntArray.put(V, i11);
            sparseIntArray.put(W, i10);
            sparseIntArray.put(X, i10);
            sparseIntArray.put(Y, i10);
            sparseIntArray.put(Z, i11);
            sparseIntArray.put(aa, i17);
            sparseIntArray.put(am, i11);
            sparseIntArray.put(an, i14);
            sparseIntArray.put(ao, i11);
            sparseIntArray.put(ap, i11);
            sparseIntArray.put(aq, i10);
            sparseIntArray.put(ar, iF3 | 196610);
            sparseIntArray.put(as, i11);
            sparseIntArray.put(at, i10);
            int i19 = 458753 | iF3;
            sparseIntArray.put(au, i19);
            sparseIntArray.put(av, i19);
            sparseIntArray.put(aw, i14);
            sparseIntArray.put(ax, i10);
            sparseIntArray.put(ay, i10);
            sparseIntArray.put(az, i10);
            sparseIntArray.put(aA, i11);
            sparseIntArray.put(aB, i10);
            sparseIntArray.put(aC, i10);
            sparseIntArray.put(aD, i11);
            sparseIntArray.put(aE, i10);
            sparseIntArray.put(aF, i10);
            sparseIntArray.put(aG, i10);
            sparseIntArray.put(aH, i14);
            sparseIntArray.put(aI, i10);
            sparseIntArray.put(al, i12);
            int i20 = iF3 | 131079;
            sparseIntArray.put(aM, i20);
            sparseIntArray.put(aO, i20);
            sparseIntArray.put(aN, i20);
            sparseIntArray.put(aP, i18);
            sparseIntArray.put(aQ, i18);
            int iF4 = f(new int[]{4}) << 24;
            sparseIntArray.put(aR, 65540 | iF4);
            int i21 = 131074 | iF4;
            sparseIntArray.put(aS, i21);
            sparseIntArray.put(aU, i21);
            int i22 = iF4 | 327683;
            sparseIntArray.put(aT, i22);
            sparseIntArray.put(aV, i22);
            sparseIntArray.put(aW, 65537 | iF4);
            int i23 = iF4 | 327681;
            sparseIntArray.put(aX, i23);
            sparseIntArray.put(aY, i22);
            int i24 = iF4 | 131072;
            sparseIntArray.put(aZ, i24);
            sparseIntArray.put(ba, i21);
            sparseIntArray.put(bb, i21);
            sparseIntArray.put(bc, i23);
            sparseIntArray.put(bd, i21);
            sparseIntArray.put(be, i23);
            sparseIntArray.put(bf, i21);
            sparseIntArray.put(bg, i23);
            sparseIntArray.put(bh, i21);
            sparseIntArray.put(bi, i23);
            sparseIntArray.put(bj, i24);
            sparseIntArray.put(bk, i21);
            sparseIntArray.put(bl, i23);
            sparseIntArray.put(bm, i21);
            sparseIntArray.put(bn, i23);
            sparseIntArray.put(bo, i21);
            sparseIntArray.put(bp, i23);
            int i25 = iF4 | ImageMetadata.JPEG_GPS_COORDINATES;
            sparseIntArray.put(bq, i25);
            sparseIntArray.put(br, i25);
            sparseIntArray.put(bs, 131083 | iF4);
            sparseIntArray.put(bt, iF4 | 196619);
            int iF5 = f(new int[]{3}) << 24;
            sparseIntArray.put(bu, iF5 | 131072);
            sparseIntArray.put(bv, iF5 | ImageMetadata.JPEG_GPS_COORDINATES);
        }
        SparseIntArray sparseIntArray2 = this.bH;
        sparseIntArray2.getClass();
        return sparseIntArray2;
    }

    public final pcz i(int i2, Object obj) {
        boolean zI;
        int i3 = h().get(i2);
        if (i3 == 0 || obj == null) {
            return null;
        }
        int iG = g(i2);
        short sO = o(i3);
        int iD = d(i3);
        boolean z2 = iD != 0;
        if (!s(i3, iG)) {
            return null;
        }
        pcz pczVar = new pcz(n(i2), sO, iD, iG, z2);
        if (obj instanceof Short) {
            zI = pczVar.g((char) ((Short) obj).shortValue());
        } else if (obj instanceof String) {
            zI = pczVar.h((String) obj);
        } else if (obj instanceof int[]) {
            zI = pczVar.j((int[]) obj);
        } else if (obj instanceof long[]) {
            zI = pczVar.k((long[]) obj);
        } else if (obj instanceof pap) {
            zI = pczVar.l(new pap[]{(pap) obj});
        } else if (obj instanceof pap[]) {
            zI = pczVar.l((pap[]) obj);
        } else if (obj instanceof byte[]) {
            zI = pczVar.i((byte[]) obj);
        } else if (obj instanceof Integer) {
            zI = pczVar.g(((Integer) obj).intValue());
        } else if (obj instanceof Long) {
            zI = pczVar.k(new long[]{((Long) obj).longValue()});
        } else if (obj instanceof Byte) {
            zI = pczVar.i(new byte[]{((Byte) obj).byteValue()});
        } else if (obj instanceof Short[]) {
            Short[] shArr = (Short[]) obj;
            int[] iArr = new int[shArr.length];
            for (int i4 = 0; i4 < shArr.length; i4++) {
                Short sh = shArr[i4];
                iArr[i4] = sh == null ? (char) 0 : (char) sh.shortValue();
            }
            zI = pczVar.j(iArr);
        } else if (obj instanceof Integer[]) {
            Integer[] numArr = (Integer[]) obj;
            int[] iArr2 = new int[numArr.length];
            for (int i5 = 0; i5 < numArr.length; i5++) {
                Integer num = numArr[i5];
                iArr2[i5] = num == null ? 0 : num.intValue();
            }
            zI = pczVar.j(iArr2);
        } else if (obj instanceof Long[]) {
            Long[] lArr = (Long[]) obj;
            long[] jArr = new long[lArr.length];
            for (int i6 = 0; i6 < lArr.length; i6++) {
                Long l2 = lArr[i6];
                jArr[i6] = l2 == null ? 0L : l2.longValue();
            }
            zI = pczVar.k(jArr);
        } else {
            if (!(obj instanceof Byte[])) {
                return null;
            }
            Byte[] bArr = (Byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            for (int i7 = 0; i7 < bArr.length; i7++) {
                Byte b2 = bArr[i7];
                bArr2[i7] = b2 == null ? (byte) 0 : b2.byteValue();
            }
            zI = pczVar.i(bArr2);
        }
        if (zI) {
            return pczVar;
        }
        return null;
    }

    public final pcz j(int i2) {
        int i3 = h().get(i2);
        if (i3 == 0) {
            return null;
        }
        int iD = d(i3);
        boolean z2 = iD != 0;
        return new pcz(n(i2), o(i3), iD, g(i2), z2);
    }

    public final pcz k(int i2) {
        return l(i2, e(i2));
    }

    public final pcz l(int i2, int i3) {
        if (!pcz.f(i3)) {
            return null;
        }
        pcr pcrVar = this.bB;
        short sN = n(i2);
        pdc pdcVar = pcrVar.a[i3];
        if (pdcVar != null) {
            return pdcVar.b(sN);
        }
        return null;
    }

    public final OutputStream m(OutputStream outputStream) {
        return new pdg(new pda(new BufferedOutputStream(outputStream, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE), this, this.bB));
    }

    public final void p(int i2) {
        this.bB.h(n(i2), e(i2));
    }

    public final void q(byte[] bArr) throws IOException {
        r(bArr, false);
    }

    public final void r(byte[] bArr, boolean z2) throws IOException {
        z(new ByteArrayInputStream(bArr), z2 ? new ByteArrayInputStream(bArr) : null);
    }

    public void readExif(String str) throws IOException {
        if (str == null) {
            throw new IllegalArgumentException("Argument is null");
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(str));
        z(bufferedInputStream, null);
        bufferedInputStream.close();
    }

    public final pap[] u(int i2) {
        return v(i2, e(i2));
    }

    public final pap[] v(int i2, int i3) {
        pcz pczVarL = l(i2, i3);
        if (pczVarL == null) {
            return null;
        }
        Object obj = pczVarL.f;
        if (obj instanceof pap[]) {
            return (pap[]) obj;
        }
        return null;
    }

    public final void x(int i2, long j2, TimeZone timeZone) {
        pcz pczVarI;
        int i3;
        int i4;
        int i5 = s;
        if (i2 == i5 || i2 == N || i2 == M) {
            DateFormat dateFormat = this.bG;
            synchronized (dateFormat) {
                dateFormat.setTimeZone(timeZone);
                pczVarI = i(i2, dateFormat.format(Long.valueOf(j2)));
            }
            if (pczVarI == null) {
                return;
            }
            y(pczVarI);
            if (i2 == i5) {
                i3 = aM;
            } else if (i2 == N) {
                i3 = aO;
            } else {
                if (i2 != M) {
                    throw new IllegalArgumentException(a.bv(i2, "Must pass a date stamp tag, unrecognized tag: "));
                }
                i3 = aN;
            }
            int offset = timeZone.getOffset(j2);
            int iAbs = Math.abs(offset);
            StringBuilder sb = new StringBuilder();
            sb.append(offset < 0 ? "-" : "+");
            long j3 = iAbs;
            sb.append(A(TimeUnit.MILLISECONDS.toHours(j3)));
            sb.append(":");
            sb.append(A(TimeUnit.MILLISECONDS.toMinutes(j3) % 60));
            pcz pczVarI2 = i(i3, sb.toString());
            if (pczVarI2 != null) {
                y(pczVarI2);
            }
            if (i2 == i5) {
                i4 = ad;
            } else if (i2 == N) {
                i4 = af;
            } else {
                if (i2 != M) {
                    throw new IllegalArgumentException(a.bv(i2, "Must pass a date stamp tag, unrecognized tag: "));
                }
                i4 = ae;
            }
            pcz pczVarI3 = i(i4, prh.N(j2));
            if (pczVarI3 != null) {
                y(pczVarI3);
            }
        }
    }

    public final void y(pcz pczVar) {
        this.bB.j(pczVar);
    }
}
