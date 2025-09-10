package defpackage;

import j$.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gee {
    public final ozl a;
    public final ozl b;
    public oyj c;
    public oyj d;
    public oyx e;
    public oyx f;
    public rwc g = rvk.a;
    public final Map h = new HashMap();
    public final Map i = new HashMap();
    public plx j;
    public boolean k;
    public boolean l;
    public ozh m;
    public ozh n;

    public gee(ozl ozlVar, ozl ozlVar2) {
        this.a = ozlVar;
        this.b = ozlVar2;
    }

    public static final oyx a(ozl ozlVar, String str) {
        HashSet hashSet = new HashSet();
        if (ozlVar.c != null) {
            hashSet.add(oym.AUDIO);
        }
        if (ozlVar.d != null) {
            hashSet.add(oym.VIDEO);
        }
        if (Collection.EL.stream(ozlVar.o).anyMatch(new fla(11))) {
            hashSet.add(oym.FRAME_METADATA);
        }
        return new oyx(hashSet, ozlVar.i, rwc.j(str));
    }

    public static final oyj b(ozl ozlVar, oyx oyxVar) {
        return new oyd(swz.i(ske.J(ozlVar.s, ozlVar.r()), new hve(ozlVar, oyxVar, 1, null), sxo.a));
    }

    public static final ozh c(ozl ozlVar, oyj oyjVar, oyx oyxVar, owq owqVar, owq owqVar2, oyt oytVar, String str) throws oxr {
        oxt oxtVarB = oxt.b(ozlVar.d.e);
        if (oxtVarB == oxt.HEVC) {
            return new ozh(ozlVar.d, ozlVar.e, ozlVar.f, ozlVar.g, ozlVar.h, oyjVar, rwc.i(ozlVar.t), rwc.i(ozlVar.u), oyxVar, ozlVar.b, owqVar, owqVar2, ozlVar.q, oytVar, rwc.j(str));
        }
        throw new oxr(oxtVarB);
    }
}
