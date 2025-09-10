package defpackage;

import android.util.Log;
import com.google.android.apps.camera.modeldownloader.uD.uCzt;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pda extends pdf {
    public static final /* synthetic */ int a = 0;
    private static final byte[] f = {69, 120, 105, 102, 0, 0};
    private static final byte[] g = {73, 67, 67, 95, 80, 82, 79, 70, 73, 76, 69, 0};
    private final pcr h;
    private final ExifInterface i;
    private short j;
    private short k;
    private int l;
    private boolean m;

    public pda(OutputStream outputStream, ExifInterface exifInterface, pcr pcrVar) {
        super(outputStream, new pcp());
        this.j = (short) 0;
        this.k = (short) 0;
        this.l = 0;
        this.m = true;
        this.i = exifInterface;
        this.h = pcrVar;
    }

    private static void k(int i, short s) {
        if (i < 0) {
            throw new IllegalStateException(String.format("Negative section length: section length read was 0x%02X%02X", Integer.valueOf((s >> 8) & 255), Integer.valueOf(s & 255)));
        }
    }

    private static void l(pcz pczVar, pdd pddVar) throws IOException {
        short s = pczVar.b;
        int i = 0;
        switch (s) {
            case 1:
            case 7:
                int i2 = pczVar.d;
                byte[] bArr = new byte[i2];
                if (s != 7 && s != 1) {
                    throw new IllegalArgumentException("Cannot get BYTE value from ".concat(pcz.c(s)));
                }
                Object obj = pczVar.f;
                obj.getClass();
                System.arraycopy(obj, 0, bArr, 0, i2);
                pddVar.write(bArr);
                return;
            case 2:
                Object obj2 = pczVar.f;
                obj2.getClass();
                byte[] bArr2 = (byte[]) obj2;
                int length = bArr2.length;
                if (length != pczVar.d || length <= 0) {
                    pddVar.write(bArr2);
                    pddVar.write(0);
                    return;
                } else {
                    bArr2[length - 1] = 0;
                    pddVar.write(bArr2);
                    return;
                }
            case 3:
                int i3 = pczVar.d;
                while (i < i3) {
                    pddVar.b((short) pczVar.b(i));
                    i++;
                }
                return;
            case 4:
            case 9:
                int i4 = pczVar.d;
                while (i < i4) {
                    pddVar.a((int) pczVar.b(i));
                    i++;
                }
                return;
            case 5:
            case 10:
                int i5 = pczVar.d;
                while (i < i5) {
                    if (s != 10 && s != 5) {
                        throw new IllegalArgumentException("Cannot get RATIONAL value from ".concat(pcz.c(s)));
                    }
                    Object obj3 = pczVar.f;
                    obj3.getClass();
                    pap papVar = ((pap[]) obj3)[i];
                    pddVar.a((int) papVar.a);
                    pddVar.a((int) papVar.b);
                    i++;
                }
                return;
            case 6:
            case 8:
            default:
                return;
        }
    }

    private static final int m(pdc pdcVar, int i) {
        int iA = pdcVar.a() * 12;
        int iA2 = i + iA + 6;
        for (pcz pczVar : pdcVar.d()) {
            if (pczVar != null && pczVar.a() > 4) {
                pczVar.g = iA2;
                iA2 += pczVar.a();
            }
        }
        return iA2;
    }

    private static final void n(pdc pdcVar, pdd pddVar) throws IOException {
        pcz[] pczVarArrD = pdcVar.d();
        pddVar.b((short) pczVarArrD.length);
        for (pcz pczVar : pczVarArrD) {
            if (pczVar != null) {
                pddVar.b(pczVar.a);
                pddVar.b(pczVar.b);
                pddVar.a(pczVar.d);
                if (pczVar.a() > 4) {
                    pddVar.a(pczVar.g);
                } else {
                    l(pczVar, pddVar);
                    int iA = 4 - pczVar.a();
                    for (int i = 0; i < iA; i++) {
                        pddVar.write(0);
                    }
                }
            }
        }
        pddVar.a(pdcVar.c);
        for (pcz pczVar2 : pczVarArrD) {
            if (pczVar2 != null && pczVar2.a() > 4) {
                l(pczVar2, pddVar);
            }
        }
    }

    @Override // defpackage.pdf
    protected final int a(int i) throws pde, IOException {
        pcr pcrVar;
        int iM;
        int iA;
        if (i == 0) {
            short sB = b(0);
            this.j = sB;
            if ((sB & (-256)) != -256) {
                throw new IllegalStateException(String.format("Unexpected section marker: %02X%02X", Integer.valueOf((sB >> 8) & 255), Integer.valueOf(this.j & 255)));
            }
            if (sB == -40 || sB == -39) {
                h(sB);
                if (this.j == -40 && (pcrVar = this.h) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (pcz pczVar : pcrVar.c()) {
                        if (pczVar.f == null) {
                            short s = pczVar.a;
                            if (!ExifInterface.t(s)) {
                                pcrVar.h(s, pczVar.e);
                                arrayList.add(pczVar);
                            }
                        }
                    }
                    pdc pdcVarB = pcrVar.b(0);
                    if (pdcVarB == null) {
                        pdcVarB = new pdc(0);
                        pcrVar.d(pdcVarB);
                    }
                    ExifInterface exifInterface = this.i;
                    int i2 = ExifInterface.B;
                    pcz pczVarJ = exifInterface.j(i2);
                    if (pczVarJ == null) {
                        throw new IOException(a.bv(i2, "No definition for crucial exif tag: "));
                    }
                    pdcVarB.e(pczVarJ);
                    pdc pdcVarB2 = pcrVar.b(2);
                    if (pdcVarB2 == null) {
                        pdcVarB2 = new pdc(2);
                        pcrVar.d(pdcVarB2);
                    }
                    if (pcrVar.b(4) != null) {
                        int i3 = ExifInterface.C;
                        pcz pczVarJ2 = exifInterface.j(i3);
                        if (pczVarJ2 == null) {
                            throw new IOException(a.bv(i3, "No definition for crucial exif tag: "));
                        }
                        pdcVarB.e(pczVarJ2);
                    }
                    if (pcrVar.b(3) != null) {
                        int i4 = ExifInterface.al;
                        pcz pczVarJ3 = exifInterface.j(i4);
                        if (pczVarJ3 == null) {
                            throw new IOException(a.bv(i4, "No definition for crucial exif tag: "));
                        }
                        pdcVarB2.e(pczVarJ3);
                    }
                    pdc pdcVarB3 = pcrVar.b(1);
                    if (pcrVar.f()) {
                        if (pdcVarB3 == null) {
                            pdcVarB3 = new pdc(1);
                            pcrVar.d(pdcVarB3);
                        }
                        int i5 = ExifInterface.D;
                        pcz pczVarJ4 = exifInterface.j(i5);
                        if (pczVarJ4 == null) {
                            throw new IOException(a.bv(i5, "No definition for crucial exif tag: "));
                        }
                        pdcVarB3.e(pczVarJ4);
                        int i6 = ExifInterface.E;
                        pcz pczVarJ5 = exifInterface.j(i6);
                        if (pczVarJ5 == null) {
                            throw new IOException(a.bv(i6, "No definition for crucial exif tag: "));
                        }
                        byte[] bArr = pcrVar.b;
                        bArr.getClass();
                        pczVarJ5.g(bArr.length);
                        pdcVarB3.e(pczVarJ5);
                        pdcVarB3.c(ExifInterface.n(ExifInterface.i));
                        pdcVarB3.c(ExifInterface.n(ExifInterface.m));
                    } else if (pcrVar.g()) {
                        if (pdcVarB3 == null) {
                            pdcVarB3 = new pdc(1);
                            pcrVar.d(pdcVarB3);
                        }
                        int iA2 = pcrVar.a();
                        int i7 = ExifInterface.i;
                        pcz pczVarJ6 = exifInterface.j(i7);
                        if (pczVarJ6 == null) {
                            throw new IOException(a.bv(i7, "No definition for crucial exif tag: "));
                        }
                        int i8 = ExifInterface.m;
                        pcz pczVarJ7 = exifInterface.j(i8);
                        if (pczVarJ7 == null) {
                            throw new IOException(a.bv(i8, "No definition for crucial exif tag: "));
                        }
                        long[] jArr = new long[iA2];
                        for (int i9 = 0; i9 < pcrVar.a(); i9++) {
                            jArr[i9] = pcrVar.i(i9).length;
                        }
                        pczVarJ7.k(jArr);
                        pdcVarB3.e(pczVarJ6);
                        pdcVarB3.e(pczVarJ7);
                        pdcVarB3.c(ExifInterface.n(ExifInterface.D));
                        pdcVarB3.c(ExifInterface.n(ExifInterface.E));
                    } else if (pdcVarB3 != null) {
                        pdcVarB3.c(ExifInterface.n(ExifInterface.i));
                        pdcVarB3.c(ExifInterface.n(ExifInterface.m));
                        pdcVarB3.c(ExifInterface.n(ExifInterface.D));
                        pdcVarB3.c(ExifInterface.n(ExifInterface.E));
                    }
                    ArrayList arrayList2 = new ArrayList(pcrVar.c());
                    if (pcrVar.f()) {
                        byte[] bArr2 = pcrVar.b;
                        bArr2.getClass();
                        arrayList2.add(new pcz((short) 0, (short) 1, bArr2.length, 0, false));
                    }
                    Collections.sort(arrayList2, new ccn(18));
                    pdc pdcVarB4 = pcrVar.b(0);
                    if (pdcVarB4 == null) {
                        iM = 8;
                    } else {
                        iM = m(pdcVarB4, 8);
                        pcz pczVarB = pdcVarB4.b(ExifInterface.n(i2));
                        pczVarB.getClass();
                        pczVarB.g(iM);
                        pdc pdcVarB5 = pcrVar.b(2);
                        if (pdcVarB5 != null) {
                            iM = m(pdcVarB5, iM);
                            pdc pdcVarB6 = pcrVar.b(3);
                            if (pdcVarB6 != null) {
                                pcz pczVarB2 = pdcVarB5.b(ExifInterface.n(ExifInterface.al));
                                pczVarB2.getClass();
                                pczVarB2.g(iM);
                                iM = m(pdcVarB6, iM);
                            }
                            pdc pdcVarB7 = pcrVar.b(4);
                            if (pdcVarB7 != null) {
                                pcz pczVarB3 = pdcVarB4.b(ExifInterface.n(ExifInterface.C));
                                pczVarB3.getClass();
                                pczVarB3.g(iM);
                                iM = m(pdcVarB7, iM);
                            }
                            pdc pdcVarB8 = pcrVar.b(1);
                            if (pdcVarB8 != null) {
                                pdcVarB4.c = iM;
                                iM = m(pdcVarB8, iM);
                            }
                            if (pcrVar.f()) {
                                if (pdcVarB8 != null) {
                                    pcz pczVarB4 = pdcVarB8.b(ExifInterface.n(ExifInterface.D));
                                    pczVarB4.getClass();
                                    pczVarB4.g(iM);
                                }
                                byte[] bArr3 = pcrVar.b;
                                bArr3.getClass();
                                iM += bArr3.length;
                            } else if (pcrVar.g()) {
                                long[] jArr2 = new long[pcrVar.a()];
                                for (int i10 = 0; i10 < pcrVar.a(); i10++) {
                                    jArr2[i10] = iM;
                                    iM += pcrVar.i(i10).length;
                                }
                                if (pdcVarB8 != null) {
                                    pcz pczVarB5 = pdcVarB8.b(ExifInterface.n(ExifInterface.i));
                                    pczVarB5.getClass();
                                    pczVarB5.k(jArr2);
                                }
                            }
                        }
                    }
                    for (int i11 = 0; i11 < arrayList2.size() && iM > 65535; i11++) {
                        pcz pczVar2 = (pcz) arrayList2.get(i11);
                        short s2 = pczVar2.a;
                        String str = uCzt.DsDPtFH;
                        if (s2 == 0) {
                            pcrVar.e();
                            pcrVar.a[1] = null;
                            Log.w("CAM_ExifTransFSM", "Removed thumbnail with size " + pczVar2.a() + str);
                            iA = pczVar2.a();
                        } else if (s2 != ExifInterface.n(i2) && s2 != ExifInterface.n(ExifInterface.al) && s2 != ExifInterface.n(ExifInterface.C) && s2 != ExifInterface.n(ExifInterface.D) && s2 != ExifInterface.n(ExifInterface.i) && pcrVar.h(s2, pczVar2.e)) {
                            Log.w("CAM_ExifTransFSM", "Removed tag " + ((int) s2) + " of size " + pczVar2.a() + str);
                            iA = pczVar2.a();
                        }
                        iM -= iA;
                    }
                    if (iM > 65535) {
                        throw new IOException("Exif header is too large (>65535), even after pruning non-essential tags!");
                    }
                    h((short) -31);
                    h((short) (iM + 8));
                    g(f);
                    ByteOrder byteOrder = pcrVar.d;
                    if (byteOrder == ByteOrder.BIG_ENDIAN) {
                        h((short) 19789);
                    } else {
                        h((short) 18761);
                    }
                    pdd pddVar = new pdd(this.c);
                    pddVar.a.order(byteOrder);
                    pddVar.b((short) 42);
                    pddVar.a(8);
                    pdc pdcVarB9 = pcrVar.b(0);
                    pdcVarB9.getClass();
                    n(pdcVarB9, pddVar);
                    pdc pdcVarB10 = pcrVar.b(2);
                    pdcVarB10.getClass();
                    n(pdcVarB10, pddVar);
                    pdc pdcVarB11 = pcrVar.b(3);
                    if (pdcVarB11 != null) {
                        n(pdcVarB11, pddVar);
                    }
                    pdc pdcVarB12 = pcrVar.b(4);
                    if (pdcVarB12 != null) {
                        n(pdcVarB12, pddVar);
                    }
                    pdc pdcVarB13 = pcrVar.b(1);
                    if (pdcVarB13 != null) {
                        n(pdcVarB13, pddVar);
                    }
                    if (pcrVar.f()) {
                        byte[] bArr4 = pcrVar.b;
                        bArr4.getClass();
                        pddVar.write(bArr4);
                    } else if (pcrVar.g()) {
                        for (int i12 = 0; i12 < pcrVar.a(); i12++) {
                            pddVar.write(pcrVar.i(i12));
                        }
                    }
                    int size = arrayList.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        pcrVar.j((pcz) arrayList.get(i13));
                    }
                }
                return 0;
            }
            if (prh.M(sB)) {
                if (this.m) {
                    char[] cArr = uek.a;
                    rnt.B(true, "ICC profile does not fit in one marker segment!");
                    h((short) -30);
                    h((short) 612);
                    g(g);
                    h((short) 257);
                    for (int i14 = 0; i14 < 298; i14++) {
                        h((short) cArr[i14]);
                    }
                }
                h(this.j);
                return 4;
            }
            if (this.h != null && sB == -31) {
                return 2;
            }
            if (sB == -30) {
                this.m = false;
            }
            h(sB);
        } else if (i != 1) {
            if (i == 2) {
                short sB2 = b(2);
                this.k = sB2;
                int i15 = ((char) sB2) - 2;
                this.l = i15;
                k(i15, this.j);
                if (this.l < 5) {
                    h(this.j);
                    h(this.k);
                    i(this.l);
                    return 0;
                }
            } else if (i != 3) {
                if (i == 4) {
                    super.d();
                    pcp pcpVar = this.b;
                    pcpVar.c(this.c, pcpVar.a());
                    this.e = -1;
                    return 4;
                }
                short sB3 = b(5);
                this.k = sB3;
                int i16 = ((char) sB3) - 2;
                this.l = i16;
                k(i16, this.j);
                j(this.l);
                return 0;
            }
            super.c(4, 3);
            super.d();
            pcp pcpVar2 = this.b;
            int i17 = pcpVar2.b;
            if (i17 + 4 > pcpVar2.c) {
                throw new IllegalStateException("Byte queue is too short");
            }
            byte[] bArr5 = new byte[4];
            System.arraycopy(pcpVar2.a, i17, bArr5, 0, 4);
            pcpVar2.b += 4;
            this.l -= 4;
            int i18 = 0;
            while (true) {
                if (i18 >= 4) {
                    j(this.l);
                    break;
                }
                if (bArr5[i18] != f[i18]) {
                    h(this.j);
                    h(this.k);
                    g(bArr5);
                    i(this.l);
                    break;
                }
                i18++;
            }
            return 0;
        }
        short sB4 = b(1);
        this.k = sB4;
        h(sB4);
        int i19 = ((char) this.k) - 2;
        this.l = i19;
        k(i19, this.j);
        i(this.l);
        return 0;
    }
}
