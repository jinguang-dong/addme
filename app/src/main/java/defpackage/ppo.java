package defpackage;

import com.google.vr.audio.Cf.qcjAcSmlN;
import java.util.Map;
import java.util.Set;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ppo {
    public static final ppo a;
    public static final ppo b;
    public static final ppo c;
    public static final ppo d;
    public static final ppo e;
    public static final ppo f;
    public static final ppo g;
    public static final ppo h;
    public static final ppo i;
    private static final Map l;
    private static final Set m;
    private static final Set n;
    private static final /* synthetic */ ppo[] o;
    public final String j;
    public final String k;

    private ppo() {
        this.j = "";
        this.k = "";
    }

    public static ppo a(String str) {
        Map map = l;
        return !map.containsKey(str) ? i : (ppo) map.get(str);
    }

    public static ppo[] values() {
        return (ppo[]) o.clone();
    }

    public final boolean b() {
        return m.contains(this);
    }

    public final boolean c() {
        return n.contains(this);
    }

    static {
        ppo ppoVar = new ppo("DNG", 0, "image/x-adobe-dng", "dng");
        a = ppoVar;
        ppo ppoVar2 = new ppo("GIF", 1, "image/gif", "gif");
        b = ppoVar2;
        ppo ppoVar3 = new ppo("JPEG", 2, "image/jpeg", "jpg");
        c = ppoVar3;
        ppo ppoVar4 = new ppo("JPEG_R", 3, "image/jpeg_r", "jpg");
        d = ppoVar4;
        ppo ppoVar5 = new ppo("PHOTOSPHERE", 4, "application/vnd.google.panorama360+jpg", "jpg");
        e = ppoVar5;
        ppo ppoVar6 = new ppo("MPEG4", 5, "video/mp4", "mp4");
        f = ppoVar6;
        ppo ppoVar7 = new ppo(qcjAcSmlN.dPGxiMGxpCTTz, 6, "video/3gpp", "3gp");
        g = ppoVar7;
        ppo ppoVar8 = new ppo("WEBM", 7, "video/webm", "webm");
        h = ppoVar8;
        ppo ppoVar9 = new ppo();
        i = ppoVar9;
        o = new ppo[]{ppoVar, ppoVar2, ppoVar3, ppoVar4, ppoVar5, ppoVar6, ppoVar7, ppoVar8, ppoVar9};
        sbr sbrVar = new sbr();
        for (ppo ppoVar10 : values()) {
            sbrVar.f(ppoVar10.j, ppoVar10);
        }
        l = sbrVar.b();
        m = scn.K(a, b, c, d, e);
        n = scn.H(f, g);
    }

    private ppo(String str, int i2, String str2, String str3) {
        this.j = str2;
        this.k = str3;
    }
}
