package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum oxt implements oxs {
    H263("video/3gpp"),
    H264("video/avc"),
    MPEG_4_SP("video/mp4v-es"),
    HEVC("video/hevc"),
    AV1("video/av01");

    public final String f;

    oxt(String str) {
        this.f = str;
    }

    public static oxt b(int i) {
        if (i == 1) {
            return H263;
        }
        if (i == 2) {
            return H264;
        }
        if (i == 3) {
            return MPEG_4_SP;
        }
        if (i == 5) {
            return HEVC;
        }
        if (i == 8) {
            return AV1;
        }
        throw new IllegalArgumentException(a.bv(i, "Unsupported video codec type: "));
    }

    @Override // defpackage.oxs
    public final String a() {
        return this.f;
    }
}
