package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aau extends ujq implements uiq {
    private final /* synthetic */ int u;
    public static final aau t = new aau(20);
    public static final aau s = new aau(19);
    public static final aau r = new aau(18);
    public static final aau q = new aau(17);
    public static final aau p = new aau(16);
    public static final aau o = new aau(15);
    public static final aau n = new aau(14);
    public static final aau m = new aau(13);
    public static final aau l = new aau(12);
    public static final aau k = new aau(11);
    public static final aau j = new aau(10);
    public static final aau i = new aau(9);
    public static final aau h = new aau(8);
    public static final aau g = new aau(7);
    public static final aau f = new aau(6);
    public static final aau e = new aau(5);
    public static final aau d = new aau(4);
    public static final aau c = new aau(3);
    public static final aau b = new aau(2);
    public static final aau a = new aau(1);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aau(int i2) {
        super(1);
        this.u = i2;
    }

    @Override // defpackage.uiq
    public final /* synthetic */ Object a(Object obj) {
        switch (this.u) {
            case 0:
                ((blm) obj).p(false);
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                bui buiVar = (bui) obj;
                buiVar.b = true;
                bko.x(buiVar);
                break;
            case 7:
                ((bui) obj).t();
                break;
            case 8:
                ((bug) obj).h().d = false;
                break;
            case 9:
                bug bugVar = (bug) obj;
                bugVar.h().e = bugVar.h().d;
                break;
            case 10:
                ((bug) obj).h().c = false;
                break;
            case 11:
                bwq bwqVar = ((bwi) obj).C;
                if (bwqVar != null) {
                    bwqVar.invalidate();
                }
                break;
            case 12:
                bwi bwiVar = (bwi) obj;
                if (bwiVar.dn() && bwi.aw(bwiVar)) {
                    bvm bvmVar = bwiVar.s;
                    bvq bvqVar = bvmVar.t;
                    if (bvqVar.k > 0) {
                        if (bvqVar.j || bvqVar.i) {
                            bvmVar.S(false);
                        }
                        bvqVar.o.B();
                    }
                    bws bwsVarA = bvp.a(bvmVar);
                    ((bxv) bwsVarA).k.d(bvmVar);
                    bwsVarA.n(bvmVar);
                }
                break;
            case 13:
                bvm bvmVar2 = (bvm) obj;
                if (bvmVar2.ag()) {
                    bvmVar2.S(false);
                }
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                bvm bvmVar3 = (bvm) obj;
                if (bvmVar3.ag()) {
                    bvmVar3.S(false);
                }
                break;
            case 15:
                bvm bvmVar4 = (bvm) obj;
                if (bvmVar4.ag()) {
                    bvmVar4.R(false);
                }
                break;
            case 16:
                bvm bvmVar5 = (bvm) obj;
                if (bvmVar5.ag()) {
                    bvmVar5.R(false);
                }
                break;
            case 17:
                bvm bvmVar6 = (bvm) obj;
                if (bvmVar6.ag()) {
                    bvm.ap(bvmVar6, false, 7);
                }
                break;
            case 18:
                bvm bvmVar7 = (bvm) obj;
                if (bvmVar7.ag()) {
                    bvm.ar(bvmVar7, false, 7);
                }
                break;
            case 19:
                bvm bvmVar8 = (bvm) obj;
                if (bvmVar8.ag()) {
                    bvmVar8.H();
                }
                break;
            default:
                break;
        }
        return ufg.a;
    }
}
