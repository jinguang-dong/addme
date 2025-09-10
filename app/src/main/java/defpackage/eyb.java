package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eyb implements eqo {
    private static final ejt c = new ejt(null, null, null, null);
    private final Context a;
    private final List b;
    private final ejt d;
    private final jod e;

    public eyb(Context context, List list, ete eteVar, etl etlVar) {
        ejt ejtVar = c;
        this.a = context.getApplicationContext();
        this.b = list;
        this.e = new jod(eteVar, etlVar, (char[]) null);
        this.d = ejtVar;
    }

    @Override // defpackage.eqo
    public final /* bridge */ /* synthetic */ esw a(Object obj, int i, int i2, eqm eqmVar) {
        epw epwVar;
        ejt ejtVar = this.d;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        epx epxVarL = ejtVar.l(byteBuffer);
        try {
            double d = fas.a;
            SystemClock.elapsedRealtimeNanos();
            if (epxVarL.b == null) {
                throw new IllegalStateException("You must call setData() before parseHeader()");
            }
            eyf eyfVar = null;
            int iHighestOneBit = 0;
            if (epxVarL.e()) {
                epwVar = epxVarL.c;
            } else {
                StringBuilder sb = new StringBuilder();
                for (int i3 = 0; i3 < 6; i3++) {
                    sb.append((char) epxVarL.a());
                }
                if (sb.toString().startsWith("GIF")) {
                    epxVarL.c.f = epxVarL.b();
                    epxVarL.c.g = epxVarL.b();
                    int iA = epxVarL.a();
                    epw epwVar2 = epxVarL.c;
                    epwVar2.h = (iA & 128) != 0;
                    epwVar2.i = (int) Math.pow(2.0d, (iA & 7) + 1);
                    epxVarL.c.j = epxVarL.a();
                    epxVarL.c.k = epxVarL.a();
                    if (epxVarL.c.h && !epxVarL.e()) {
                        epw epwVar3 = epxVarL.c;
                        epwVar3.a = epxVarL.f(epwVar3.i);
                        epw epwVar4 = epxVarL.c;
                        epwVar4.l = epwVar4.a[epwVar4.j];
                    }
                } else {
                    epxVarL.c.b = 1;
                }
                if (!epxVarL.e()) {
                    while (!epxVarL.e()) {
                        int i4 = epxVarL.c.c;
                        int iA2 = epxVarL.a();
                        if (iA2 == 33) {
                            int iA3 = epxVarL.a();
                            if (iA3 == 1) {
                                epxVarL.d();
                            } else if (iA3 == 249) {
                                epxVarL.c.d = new epv();
                                epxVarL.a();
                                int iA4 = epxVarL.a();
                                epv epvVar = epxVarL.c.d;
                                int i5 = (iA4 & 28) >> 2;
                                epvVar.g = i5;
                                if (i5 == 0) {
                                    epvVar.g = 1;
                                }
                                epvVar.f = 1 == (iA4 & 1);
                                int iB = epxVarL.b();
                                if (iB < 2) {
                                    iB = 10;
                                }
                                epv epvVar2 = epxVarL.c.d;
                                epvVar2.i = iB * 10;
                                epvVar2.h = epxVarL.a();
                                epxVarL.a();
                            } else if (iA3 == 254) {
                                epxVarL.d();
                            } else if (iA3 != 255) {
                                epxVarL.d();
                            } else {
                                epxVarL.c();
                                StringBuilder sb2 = new StringBuilder();
                                for (int i6 = 0; i6 < 11; i6++) {
                                    sb2.append((char) epxVarL.a[i6]);
                                }
                                if (sb2.toString().equals("NETSCAPE2.0")) {
                                    do {
                                        epxVarL.c();
                                        byte[] bArr = epxVarL.a;
                                        if (bArr[0] == 1) {
                                            epxVarL.c.m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
                                        }
                                        if (epxVarL.d > 0) {
                                        }
                                    } while (!epxVarL.e());
                                } else {
                                    epxVarL.d();
                                }
                            }
                        } else if (iA2 == 44) {
                            epw epwVar5 = epxVarL.c;
                            if (epwVar5.d == null) {
                                epwVar5.d = new epv();
                            }
                            epwVar5.d.a = epxVarL.b();
                            epxVarL.c.d.b = epxVarL.b();
                            epxVarL.c.d.c = epxVarL.b();
                            epxVarL.c.d.d = epxVarL.b();
                            int iA5 = epxVarL.a();
                            int i7 = iA5 & 128;
                            int iPow = (int) Math.pow(2.0d, (iA5 & 7) + 1);
                            epv epvVar3 = epxVarL.c.d;
                            epvVar3.e = (iA5 & 64) != 0;
                            if (i7 != 0) {
                                epvVar3.k = epxVarL.f(iPow);
                            } else {
                                epvVar3.k = null;
                            }
                            epxVarL.c.d.j = epxVarL.b.position();
                            epxVarL.a();
                            epxVarL.d();
                            if (!epxVarL.e()) {
                                epw epwVar6 = epxVarL.c;
                                epwVar6.c++;
                                epwVar6.e.add(epwVar6.d);
                            }
                        } else {
                            if (iA2 == 59) {
                                break;
                            }
                            epxVarL.c.b = 1;
                        }
                    }
                    epw epwVar7 = epxVarL.c;
                    if (epwVar7.c < 0) {
                        epwVar7.b = 1;
                    }
                }
                epwVar = epxVarL.c;
            }
            if (epwVar.c > 0 && epwVar.b == 0) {
                Bitmap.Config config = eqmVar.b(eyj.a) == epz.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int iMin = Math.min(epwVar.g / i2, epwVar.f / i);
                if (iMin != 0) {
                    iHighestOneBit = Integer.highestOneBit(iMin);
                }
                epy epyVar = new epy(this.e, epwVar, byteBuffer, Math.max(1, iHighestOneBit));
                if (config != Bitmap.Config.ARGB_8888 && config != Bitmap.Config.RGB_565) {
                    throw new IllegalArgumentException("Unsupported format: " + String.valueOf(config) + ", must be one of " + String.valueOf(Bitmap.Config.ARGB_8888) + " or " + String.valueOf(Bitmap.Config.RGB_565));
                }
                epyVar.i = config;
                epyVar.b();
                Bitmap bitmapA = epyVar.a();
                if (bitmapA != null) {
                    eyfVar = new eyf(new eyd(new eyc(new eyi(eox.b(this.a), epyVar, i, i2, ewb.b, bitmapA))));
                }
            }
            ejtVar.m(epxVarL);
            return eyfVar;
        } catch (Throwable th) {
            this.d.m(epxVarL);
            throw th;
        }
    }

    @Override // defpackage.eqo
    public final /* bridge */ /* synthetic */ boolean b(Object obj, eqm eqmVar) {
        return !((Boolean) eqmVar.b(eyj.b)).booleanValue() && eoy.e(this.b, (ByteBuffer) obj) == ImageHeaderParser$ImageType.GIF;
    }
}
