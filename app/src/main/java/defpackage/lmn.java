package defpackage;

import android.graphics.Rect;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class lmn extends lmp {
    protected final pas a;
    protected final int b;
    private final pbn i;

    public lmn(lmg lmgVar, Executor executor, lly llyVar, int i, lss lssVar, pas pasVar, int i2, pbn pbnVar) {
        super(lmgVar, executor, llyVar, i, lssVar);
        this.a = pasVar;
        this.b = i2;
        this.i = pbnVar;
    }

    protected static int a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        return (i8 * (i5 / i3)) + (i7 * (i6 / i3)) + ((i2 / i4) * i5) + ((i / i4) * i6);
    }

    protected static final int c(int i, int i2) {
        return (Math.min(i2, i) / 2) + 1;
    }

    protected static final void d(lmg lmgVar) {
        poj pojVar = lmgVar.a;
        pojVar.c();
        pojVar.b();
    }

    protected static final int[] e(poj pojVar, Rect rect, int i, boolean z) {
        int i2;
        int iK;
        int i3;
        int iK2;
        int i4;
        int i5;
        Rect rectI = i(pojVar, rect);
        List listG = pojVar.g();
        if (listG.size() != 3) {
            throw new IllegalArgumentException("Incorrect number planes (" + listG.size() + ") in YUV Image Object");
        }
        int iWidth = rectI.width() / i;
        int iHeight = rectI.height() / i;
        ByteBuffer buffer = ((poi) listG.get(0)).getBuffer();
        ByteBuffer buffer2 = ((poi) listG.get(1)).getBuffer();
        ByteBuffer buffer3 = ((poi) listG.get(2)).getBuffer();
        int rowStride = ((poi) listG.get(0)).getRowStride() * i;
        int rowStride2 = ((poi) listG.get(1)).getRowStride() * i;
        int rowStride3 = ((poi) listG.get(2)).getRowStride() * i;
        int pixelStride = ((poi) listG.get(0)).getPixelStride() * i;
        int pixelStride2 = ((poi) listG.get(1)).getPixelStride() * i;
        int pixelStride3 = ((poi) listG.get(2)).getPixelStride() * i;
        int iK3 = k(rectI.top);
        int iK4 = k(rectI.left);
        if (z) {
            int iC = c(iWidth, iHeight);
            int i6 = iC * iC;
            int i7 = iC + iC;
            if (iWidth > iHeight) {
                int i8 = iWidth / 2;
                int i9 = i8 - iC;
                int iK5 = k(i8 + iC);
                int iK6 = k(i9);
                iK = iHeight;
                i3 = iK5;
                i5 = iK6;
                iK2 = 0;
            } else {
                int i10 = iHeight / 2;
                int i11 = i10 - iC;
                int iK7 = k(i10 + iC);
                iK2 = k(i11);
                iK = iK7;
                i3 = iWidth;
                i5 = 0;
            }
            i2 = i6 * 4;
            i4 = i5;
            iWidth = i7;
        } else {
            i2 = iWidth * iHeight;
            int iK8 = k(iWidth);
            iK = k(iHeight);
            i3 = iK8;
            iK2 = 0;
            i4 = 0;
        }
        int[] iArr = new int[i2];
        ((poi) listG.get(1)).getRowStride();
        ((poi) listG.get(1)).getPixelStride();
        ((poi) listG.get(2)).getRowStride();
        ((poi) listG.get(2)).getPixelStride();
        int i12 = iK2;
        while (i12 < iK) {
            int i13 = (i12 - iK2) * iWidth;
            int i14 = iK;
            int i15 = i12;
            int i16 = i14;
            int iA = a(i4, i15, i, 1, rowStride, pixelStride, iK4, iK3);
            int i17 = pixelStride;
            int i18 = i4;
            int i19 = iK4;
            int i20 = iK3;
            int i21 = i19 / 2;
            int i22 = i20 / 2;
            int iA2 = a(i18, i15, i, 2, rowStride2, pixelStride2, i21, i22);
            int i23 = pixelStride2;
            int i24 = iK2;
            int i25 = iA;
            int iA3 = a(i18, i15, i, 2, rowStride3, pixelStride3, i21, i22);
            int i26 = iA2;
            int i27 = i18;
            while (i27 < i3) {
                int i28 = i16;
                int i29 = i26;
                int i30 = buffer2.get(i26) & 255;
                int i31 = buffer3.get(iA3) & 255;
                int i32 = buffer.get(i25) & 255;
                int i33 = i30 - 128;
                int i34 = i31 - 128;
                int i35 = iWidth;
                int i36 = ((i33 * (-88)) + (i34 * (-182))) >> 8;
                int i37 = i32 + i36;
                int i38 = i37 < 0 ? 0 : i37;
                int i39 = (i34 * 358) >> 8;
                int i40 = i32 + i39;
                int i41 = i40 < 0 ? 0 : i40;
                int i42 = (i33 * 453) >> 8;
                int i43 = i32 + i42;
                int i44 = i43 < 0 ? 0 : i43;
                int i45 = i3;
                if (i38 > 255) {
                    i38 = 255;
                }
                if (i41 > 255) {
                    i41 = 255;
                }
                if (i44 > 255) {
                    i44 = 255;
                }
                iArr[i13] = i44 | (i41 << 16) | (i38 << 8) | (-16777216);
                int i46 = buffer.get(i25 + i17) & 255;
                int i47 = i46 + i36;
                if (i47 < 0) {
                    i47 = 0;
                }
                int i48 = i46 + i39;
                if (i48 < 0) {
                    i48 = 0;
                }
                int i49 = i46 + i42;
                if (i49 < 0) {
                    i49 = 0;
                }
                if (i47 > 255) {
                    i47 = 255;
                }
                if (i48 > 255) {
                    i48 = 255;
                }
                if (i49 > 255) {
                    i49 = 255;
                }
                iArr[i13 + 1] = i49 | (i47 << 8) | (i48 << 16) | (-16777216);
                int i50 = i25 + rowStride;
                int i51 = buffer.get(i50) & 255;
                int i52 = i51 + i36;
                if (i52 < 0) {
                    i52 = 0;
                }
                int i53 = i51 + i39;
                if (i53 < 0) {
                    i53 = 0;
                }
                int i54 = i51 + i42;
                if (i54 < 0) {
                    i54 = 0;
                }
                if (i52 > 255) {
                    i52 = 255;
                }
                if (i53 > 255) {
                    i53 = 255;
                }
                if (i54 > 255) {
                    i54 = 255;
                }
                int i55 = i13 + i35;
                iArr[i55] = i54 | (i52 << 8) | (i53 << 16) | (-16777216);
                int i56 = buffer.get(i50 + i17) & 255;
                int i57 = i56 + i36;
                int i58 = i57 < 0 ? 0 : i57;
                int i59 = i56 + i39;
                if (i59 < 0) {
                    i59 = 0;
                }
                int i60 = i56 + i42;
                if (i60 < 0) {
                    i60 = 0;
                }
                int i61 = 255;
                if (i58 > 255) {
                    i58 = 255;
                }
                if (i59 > 255) {
                    i59 = 255;
                }
                if (i60 <= 255) {
                    i61 = i60;
                }
                iArr[i55 + 1] = i61 | (i59 << 16) | (i58 << 8) | (-16777216);
                i25 += i17 + i17;
                i13 += 2;
                i26 = i29 + i23;
                iA3 += pixelStride3;
                i27 += 2;
                i16 = i28;
                i3 = i45;
                iWidth = i35;
            }
            int i62 = i16;
            i12 = i15 + 2;
            pixelStride = i17;
            i4 = i18;
            pixelStride2 = i23;
            iK2 = i24;
            iK3 = i20;
            iK = i62;
            iK4 = i19;
        }
        return iArr;
    }

    private static int k(int i) {
        int i2 = i / 2;
        return i2 + i2;
    }

    protected final int[] b(poj pojVar, Rect rect, int i) {
        int iK;
        int iK2;
        int iK3;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12 = this.b - 1;
        int i13 = 0;
        if (i12 != 2) {
            return i12 != 3 ? e(pojVar, rect, i, false) : e(pojVar, rect, i, true);
        }
        Rect rectI = i(pojVar, rect);
        List listG = pojVar.g();
        if (listG.size() != 3) {
            throw new IllegalArgumentException("Incorrect number planes (" + listG.size() + ") in YUV Image Object");
        }
        int iWidth = rectI.width() / i;
        int iHeight = rectI.height() / i;
        int iC = c(iWidth, iHeight);
        int iK4 = k(rectI.top);
        int iK5 = k(rectI.left);
        if (iWidth > iHeight) {
            int i14 = iWidth / 2;
            int i15 = i14 - iC;
            int iK6 = k(i14 + iC);
            iK3 = 0;
            iK2 = k(i15);
            i2 = iK6;
            iK = iHeight;
        } else {
            int i16 = iHeight / 2;
            int i17 = i16 - iC;
            iK = k(i16 + iC);
            iK2 = 0;
            iK3 = k(i17);
            i2 = iWidth;
        }
        ByteBuffer buffer = ((poi) listG.get(0)).getBuffer();
        ByteBuffer buffer2 = ((poi) listG.get(1)).getBuffer();
        ByteBuffer buffer3 = ((poi) listG.get(2)).getBuffer();
        int rowStride = ((poi) listG.get(0)).getRowStride() * i;
        int rowStride2 = ((poi) listG.get(1)).getRowStride() * i;
        int rowStride3 = ((poi) listG.get(2)).getRowStride() * i;
        int pixelStride = ((poi) listG.get(0)).getPixelStride() * i;
        int pixelStride2 = ((poi) listG.get(1)).getPixelStride() * i;
        int pixelStride3 = ((poi) listG.get(2)).getPixelStride() * i;
        int i18 = iC + iC;
        int i19 = iHeight / 2;
        int i20 = iWidth / 2;
        int[] iArr = new int[iC * iC * 4];
        ((poi) listG.get(1)).getRowStride();
        ((poi) listG.get(1)).getPixelStride();
        ((poi) listG.get(2)).getRowStride();
        ((poi) listG.get(2)).getPixelStride();
        int i21 = iK5;
        int i22 = iK3;
        while (i22 < iK) {
            int i23 = (i22 - iK3) * i18;
            ByteBuffer byteBuffer = buffer3;
            int i24 = iK2;
            int i25 = rowStride;
            int i26 = pixelStride;
            int[] iArr2 = iArr;
            int iA = a(i24, i22, i, 1, i25, i26, i21, iK4);
            int i27 = i21;
            int i28 = iK4;
            int i29 = i27 / 2;
            int i30 = i28 / 2;
            int i31 = rowStride2;
            int i32 = pixelStride2;
            int iA2 = a(i24, i22, i, 2, i31, i32, i29, i30);
            int i33 = rowStride3;
            int i34 = pixelStride3;
            int iA3 = a(i24, i22, i, 2, i33, i34, i29, i30);
            int i35 = i22 - i19;
            int iSqrt = (int) (Math.sqrt(r25 - (i35 * i35)) + 0.5d);
            int i36 = i20 - iSqrt;
            int i37 = i20 + iSqrt;
            int i38 = (i22 + 1) - i19;
            int i39 = i13;
            int iSqrt2 = (int) (Math.sqrt(r25 - (i38 * i38)) + 0.5d);
            int i40 = i20 - iSqrt2;
            int i41 = i20 + iSqrt2;
            int i42 = i24;
            int i43 = i22;
            int i44 = iA2;
            int i45 = iA;
            while (i42 < i2) {
                int i46 = i23 + i18;
                int i47 = i46 + 1;
                int i48 = i23 + 1;
                if (i42 <= i37 || i42 <= i41) {
                    i3 = i33;
                    int i49 = i42 + 1;
                    if (i49 >= i36 || i42 >= i40) {
                        i4 = i34;
                        i5 = i44;
                        int i50 = buffer2.get(i44) & 255;
                        int i51 = byteBuffer.get(iA3) & 255;
                        int i52 = i50 - 128;
                        i6 = iA3;
                        int i53 = i51 - 128;
                        int i54 = (i52 * 453) >> 8;
                        int i55 = ((i52 * (-88)) + (i53 * (-182))) >> 8;
                        int i56 = (i53 * 358) >> 8;
                        if (i42 > i37 || i42 < i36) {
                            i7 = i55;
                            i8 = i45;
                            i9 = i54;
                            i10 = i56;
                            iArr2[i23] = i39;
                        } else {
                            if (i42 == i37 || i42 == i36) {
                                i7 = i55;
                                i11 = Integer.MIN_VALUE;
                            } else {
                                i7 = i55;
                                i11 = -16777216;
                            }
                            i8 = i45;
                            int i57 = buffer.get(i45) & 255;
                            int i58 = i57 + i7;
                            int i59 = i57 + i54;
                            int i60 = i57 + i56;
                            if (i58 < 0) {
                                i58 = i39;
                            }
                            if (i60 < 0) {
                                i60 = i39;
                            }
                            i9 = i54;
                            int i61 = i59 < 0 ? i39 : i59;
                            i10 = i56;
                            if (i58 > 255) {
                                i58 = 255;
                            }
                            if (i60 > 255) {
                                i60 = 255;
                            }
                            if (i61 > 255) {
                                i61 = 255;
                            }
                            iArr2[i23] = (i60 << 16) | (i58 << 8) | i61 | i11;
                        }
                        if (i49 > i37 || i49 < i36) {
                            iArr2[i48] = i39;
                        } else {
                            int i62 = (i49 == i37 || i49 == i36) ? Integer.MIN_VALUE : -16777216;
                            int i63 = buffer.get(i8 + i26) & 255;
                            int i64 = i63 + i7;
                            int i65 = i63 + i9;
                            int i66 = i63 + i10;
                            if (i64 < 0) {
                                i64 = i39;
                            }
                            if (i66 < 0) {
                                i66 = i39;
                            }
                            if (i65 < 0) {
                                i65 = i39;
                            }
                            int i67 = i62;
                            if (i64 > 255) {
                                i64 = 255;
                            }
                            if (i66 > 255) {
                                i66 = 255;
                            }
                            if (i65 > 255) {
                                i65 = 255;
                            }
                            iArr2[i48] = (i66 << 16) | (i64 << 8) | i65 | i67;
                        }
                        if (i42 > i41 || i42 < i40) {
                            iArr2[i46] = i39;
                        } else {
                            int i68 = i8 + i25;
                            int i69 = (i42 == i41 || i42 == i40) ? Integer.MIN_VALUE : -16777216;
                            int i70 = buffer.get(i68) & 255;
                            int i71 = i70 + i7;
                            int i72 = i70 + i9;
                            int i73 = i70 + i10;
                            if (i71 < 0) {
                                i71 = i39;
                            }
                            if (i73 < 0) {
                                i73 = i39;
                            }
                            if (i72 < 0) {
                                i72 = i39;
                            }
                            int i74 = i69;
                            if (i71 > 255) {
                                i71 = 255;
                            }
                            if (i73 > 255) {
                                i73 = 255;
                            }
                            if (i72 > 255) {
                                i72 = 255;
                            }
                            iArr2[i46] = (i73 << 16) | (i71 << 8) | i72 | i74;
                        }
                        if (i49 > i41 || i49 < i40) {
                            iArr2[i47] = i39;
                        } else {
                            int i75 = i8 + i25;
                            int i76 = (i49 == i41 || i49 == i40) ? Integer.MIN_VALUE : -16777216;
                            int i77 = buffer.get(i75 + i26) & 255;
                            int i78 = i77 + i7;
                            int i79 = i77 + i9;
                            int i80 = i77 + i10;
                            if (i78 < 0) {
                                i78 = i39;
                            }
                            if (i80 < 0) {
                                i80 = i39;
                            }
                            if (i79 < 0) {
                                i79 = i39;
                            }
                            if (i78 > 255) {
                                i78 = 255;
                            }
                            if (i80 > 255) {
                                i80 = 255;
                            }
                            if (i79 > 255) {
                                i79 = 255;
                            }
                            iArr2[i47] = (i80 << 16) | (i78 << 8) | i79 | i76;
                        }
                    }
                    i45 = i8 + i26 + i26;
                    i23 += 2;
                    i44 = i5 + i32;
                    iA3 = i6 + i4;
                    i42 += 2;
                    i33 = i3;
                    i34 = i4;
                } else {
                    i3 = i33;
                }
                iArr2[i23] = i39;
                iArr2[i48] = i39;
                iArr2[i46] = i39;
                iArr2[i47] = i39;
                i5 = i44;
                i8 = i45;
                i6 = iA3;
                i4 = i34;
                i45 = i8 + i26 + i26;
                i23 += 2;
                i44 = i5 + i32;
                iA3 = i6 + i4;
                i42 += 2;
                i33 = i3;
                i34 = i4;
            }
            i22 = i43 + 2;
            i13 = i39;
            buffer3 = byteBuffer;
            iArr = iArr2;
            rowStride2 = i31;
            iK4 = i28;
            i21 = i27;
            rowStride = i25;
            pixelStride = i26;
            pixelStride2 = i32;
            rowStride3 = i33;
            pixelStride3 = i34;
            iK2 = i24;
        }
        return iArr;
    }

    protected final nw f(lmg lmgVar, int i) {
        int iWidth;
        int iHeight;
        int i2 = this.b;
        Rect rectI = i(lmgVar.a, lmgVar.e);
        if (i2 == 5) {
            iWidth = rectI.width() / i;
            iHeight = rectI.height() / i;
        } else {
            int iC = c(rectI.width() / i, rectI.height() / i);
            iWidth = iC + iC;
            iHeight = iWidth;
        }
        return new nw(lmgVar.b, iWidth, iHeight);
    }

    public final void g(nw nwVar, int[] iArr, int i) {
        this.h.k.d(new lmo(this.d, nwVar, i), new ggg(iArr, (byte[]) null));
    }

    @Override // java.lang.Runnable
    public void run() {
        int iE;
        this.i.f("CAM_TaskRGBPreview");
        lmg lmgVar = this.e;
        poj pojVar = lmgVar.a;
        Rect rectI = i(pojVar, lmgVar.e);
        d(lmgVar);
        pas pasVar = new pas(rectI.width(), rectI.height());
        int i = this.b;
        if (i == 3 || i == 4) {
            pas pasVar2 = this.a;
            int i2 = pasVar.a;
            int i3 = pasVar.b;
            int iMin = Math.min(i2 / pasVar2.a, i3 / pasVar2.b);
            if (iMin > 0) {
                int iMin2 = Math.min(i2, i3);
                while (true) {
                    if (iMin < 2) {
                        iE = 2;
                        break;
                    } else {
                        if (lpa.f(iMin2, iMin)) {
                            iE = iMin;
                            break;
                        }
                        iMin--;
                    }
                }
            } else {
                iE = 1;
            }
        } else {
            iE = lpa.e(pasVar, this.a);
        }
        nw nwVarF = f(lmgVar, iE);
        try {
            j(this.d, nwVarF, 1);
            pojVar.c();
            pojVar.b();
            int[] iArrB = b(pojVar, rectI, iE);
            this.h.b(lmgVar.a, this.c);
            g(nwVarF, iArrB, 1);
            this.i.g();
        } catch (Throwable th) {
            this.h.b(lmgVar.a, this.c);
            throw th;
        }
    }
}
