package defpackage;

import android.media.MediaCodecInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oxo implements oxn {
    private static final scn a = scn.I(new pas(720, 480), new pas(704, 480), new pas(640, 480));
    private static final scn b = scn.H(oxj.RES_720P.c(), oxj.RES_720P_3X4.c());
    private static final scn c = scn.H(oxj.RES_1080P.c(), oxj.RES_1080P_3X4.c());
    private static final scn d = scn.I(oxj.RES_2160P.c(), oxj.RES_2160P_3X4.c(), oxj.RES_2268P.c());
    private final int[] e = {8000, 11025, 12000, 16000, 22050, 24000, 44100, 48000, 192000};
    private final pfl f;

    public oxo(pfl pflVar) {
        this.f = pflVar;
    }

    @Override // defpackage.oxn
    public final oxm a(oxh oxhVar, oxy oxyVar) {
        int i = oxyVar.d;
        return new oxm(oxe.a(oxyVar.c), oxyVar.a, i, i * oxhVar.a(), oxyVar.b);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.oxn
    public final oxm b(oxh oxhVar, oxy oxyVar) {
        int i;
        oxe oxeVarA = oxe.a(oxyVar.c);
        oxg oxgVar = oxeVarA.h;
        ?? r1 = this.f.a;
        String str = oxgVar.e;
        MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) r1.get(str);
        rnt.x(mediaCodecInfo);
        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
        rnt.x(capabilitiesForType);
        MediaCodecInfo.AudioCapabilities audioCapabilities = capabilitiesForType.getAudioCapabilities();
        rnt.x(audioCapabilities);
        int i2 = 0;
        int iA = 0;
        while (true) {
            if (i2 >= 9) {
                break;
            }
            int i3 = this.e[i2];
            if (audioCapabilities.isSampleRateSupported(i3)) {
                if (i3 >= oxyVar.d) {
                    iA = i3;
                    break;
                }
                iA = i3;
            }
            i2++;
        }
        int iA2 = oxhVar.a() * iA;
        if (iA2 > 192000) {
            iA = 192000 / oxhVar.a();
            i = 192000;
        } else {
            i = iA2;
        }
        rnt.s(iA > 0);
        rnt.s(i > 0);
        return new oxm(oxeVarA, oxyVar.a, iA, i, oxyVar.b);
    }

    @Override // defpackage.oxn
    public final oxp c(oxy oxyVar, oxh oxhVar, oxj oxjVar) {
        return d(oxyVar, oxhVar, oxjVar, oxhVar == oxh.FPS_AUTO ? 2.0f : 1.0f);
    }

    @Override // defpackage.oxn
    public final oxp d(oxy oxyVar, oxh oxhVar, oxj oxjVar, float f) {
        oxi oxiVar;
        a.I(e(oxyVar, oxhVar, oxjVar));
        boolean zG = oxhVar.g();
        int i = oxhVar.k;
        int i2 = oxyVar.l;
        int i3 = oxyVar.g;
        if (zG) {
            if (i < i2) {
                i3 = (int) (i3 * (i / i2));
            }
        } else {
            if (!oxhVar.h()) {
                throw new IllegalArgumentException("unsupported capture frame rate =" + i + " and encoding frame rate=" + oxhVar.l);
            }
            if (i <= 30 && i2 == 60) {
                i3 = (int) (i3 / 1.5d);
            }
        }
        int i4 = i3;
        a.I(oxi.a(oxyVar));
        int i5 = oxyVar.e;
        if (i5 == 1) {
            oxiVar = oxi.THREE_GPP;
        } else {
            if (i5 != 2) {
                throw new IllegalArgumentException("file format is not supported: " + i5);
            }
            oxiVar = oxi.MPEG_4;
        }
        int i6 = oxyVar.h;
        int i7 = oxyVar.i;
        int i8 = oxyVar.j;
        rvk rvkVar = rvk.a;
        return new oxp(oxiVar, oxjVar, i4, oxhVar, i6, i7, i8, f, rvkVar, rvkVar);
    }

    @Override // defpackage.oxn
    public final boolean e(oxy oxyVar, oxh oxhVar, oxj oxjVar) {
        if (oxhVar.m > oxyVar.l) {
            return false;
        }
        int i = oxyVar.f;
        return (i == 4 ? a.contains(oxjVar.c()) : (i == 5 || i == 2003) ? b.contains(oxjVar.c()) : (i == 6 || i == 2004) ? c.contains(oxjVar.c()) : (i == 8 || i == 2005) ? d.contains(oxjVar.c()) : new pas(oxyVar.m, oxyVar.k).equals(oxjVar.c())) && oxi.a(oxyVar);
    }
}
