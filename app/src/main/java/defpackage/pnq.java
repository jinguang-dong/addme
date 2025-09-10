package defpackage;

import android.os.Build;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pnq {
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    private final boolean G;
    private final boolean H;
    private final boolean I;
    private final boolean J;
    private final boolean K;
    private final boolean L;
    private final boolean M;
    private final boolean N;
    private final boolean O;
    private final boolean P;
    private final boolean Q;
    private final boolean R;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    private pnq(long j, long j2) {
        boolean z;
        this.a = j == -8977428044353436645L;
        if (j == -5238078545268050332L) {
            z = true;
        } else if (j == -6484838752004453339L) {
            z = true;
            j = -6484838752004453339L;
        } else {
            z = false;
        }
        this.b = z;
        this.d = j == 2353878190013225779L;
        this.c = j == 5177423953723387160L;
        this.e = j == 1998349393618216766L;
        this.f = j == -3048193804805810922L;
        this.G = j == -1134170917312626182L;
        this.H = j == 7819589124620182093L;
        this.I = j == 1863053326329578117L;
        this.J = j == -6540513541338685385L;
        this.g = j == 8020350475331722164L;
        this.h = j == 4736388726057620427L;
        this.i = j == 1128693008105137506L;
        this.j = j == -2165063365505996463L;
        this.k = j == -6176613516764112573L;
        this.K = j == 8476275058780644385L;
        this.l = j == -5619725207126906835L;
        this.L = j == -1152407906810979636L;
        this.m = j == 4003097551557419468L;
        this.n = j == -3704938238089310216L;
        this.o = j == -1280572264377593363L;
        this.p = j == -381037733589485599L;
        this.q = j == -1047407971738119953L;
        this.r = j == -8855284661636827676L;
        this.s = j == -8315270892160693163L;
        this.N = j == -7371889686577558909L;
        this.M = j == -2846298906185802293L;
        this.t = j == 8742890211663261537L;
        this.u = j == 6662093836018699494L;
        this.v = j == -7689325198775259129L;
        this.w = j == 523122668435921514L;
        this.x = j == 431255487411657830L;
        this.y = j == -3413669084386384083L;
        this.z = j == -2232617303854396113L;
        this.A = j == 4170861815979786498L;
        this.B = j == -6292427525077219593L;
        this.C = j == 7410031657857767569L;
        this.D = j == -1382335652420774941L;
        this.O = j == -2336920489430415671L;
        this.P = j == 8596668348865534343L;
        this.Q = j2 == 1023628278078225909L;
        this.E = j2 == -2627109138927994667L;
        this.R = j2 == 5548592425810758430L;
        this.F = j2 == -6275142522872619409L;
    }

    static long a(String str, String str2, String str3) {
        String strF;
        if (str3 == null) {
            strF = mn.f(str, str2, "G1V5VHBME0Mq6trmUxb9Q9URJXm0Sof1|", "|");
        } else {
            strF = "G1V5VHBME0Mq6trmUxb9Q9URJXm0Sof1|" + str2 + "|" + str + "|" + str3;
        }
        int i = slm.a;
        slj sljVar = sll.a;
        String upperCase = strF.toUpperCase(Locale.ROOT);
        int length = upperCase.length();
        slk slkVarC = ((sld) sljVar).c(length + length);
        slkVarC.e(upperCase);
        return slkVarC.m().c();
    }

    public static pnq b() {
        String str = Build.MANUFACTURER;
        String str2 = Build.DEVICE;
        String str3 = Build.FINGERPRINT;
        String strP = p(str);
        String strP2 = p(str2);
        String strP3 = p(str3);
        return (strP2.startsWith("GENERIC") || strP3.startsWith("GENERIC") || strP3.contains("SDK_") || strP3.contains("_SDK")) ? new pnq(-8977428044353436645L, -8977428044353436645L) : new pnq(a(strP, strP2, null), a(strP, strP2, Build.HARDWARE));
    }

    private static String p(String str) {
        return str == null ? "unknown" : str.toUpperCase(Locale.ROOT);
    }

    public final boolean c() {
        return this.q || this.r || this.s;
    }

    public final boolean d() {
        return this.B;
    }

    public final boolean e() {
        return this.P || this.O;
    }

    public final boolean f() {
        return this.y || this.z || this.A;
    }

    public final boolean g() {
        return this.H || this.G;
    }

    public final boolean h() {
        return this.I || this.J;
    }

    public final boolean i() {
        return this.K || this.L || this.m || this.n;
    }

    public final boolean j() {
        return this.B || this.u;
    }

    public final boolean k() {
        return l();
    }

    public final boolean l() {
        return this.M || this.N;
    }

    public final boolean m() {
        return this.D || e() || n();
    }

    public final boolean n() {
        return this.Q || this.E || this.R || this.F;
    }

    public final boolean o() {
        return this.v || this.w;
    }
}
