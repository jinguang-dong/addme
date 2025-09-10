package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pgf {
    public final pdv a;
    public final Set b;
    private int f;
    private boolean g;
    private final lat i;
    private poe e = null;
    private boolean h = false;
    public pdo c = null;
    private final List d = new ArrayList();

    public pgf(lat latVar, pdv pdvVar, Set set) {
        this.a = pdvVar;
        this.b = set;
        this.i = latVar;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, uem] */
    public static pgf o(pfl pflVar, pdv pdvVar, Set set) {
        scn<pio> scnVarF = scn.F(set);
        rnt.s(scnVarF.size() == pdvVar.d().size());
        for (pio pioVar : scnVarF) {
            rnt.v(pdvVar.d().contains(pioVar.d()), "%s is not present in %s", pioVar.d(), pdvVar);
        }
        lat latVar = (lat) pflVar.a.a();
        latVar.getClass();
        pdvVar.getClass();
        scnVarF.getClass();
        pgf pgfVar = new pgf(latVar, pdvVar, scnVarF);
        Iterator it = scnVarF.iterator();
        while (it.hasNext()) {
            ((pio) it.next()).k(pgfVar);
        }
        return pgfVar;
    }

    private final boolean q() {
        return this.c != null && this.g && this.f == this.b.size();
    }

    private final void r(ojl ojlVar) {
        if (this.c == null) {
            this.i.B(ojlVar, true, false, null, false, null, false, false);
        } else {
            this.i.B(ojlVar, false, false, null, !this.g, null, this.f != this.b.size(), !q());
        }
    }

    public final paq a(boolean z) {
        Set<pio> set = this.b;
        if (set.isEmpty()) {
            return null;
        }
        if (set.size() == 1) {
            pio pioVar = (pio) set.iterator().next();
            return z ? pioVar.b() : pioVar.a();
        }
        our ourVar = new our();
        boolean z2 = false;
        for (pio pioVar2 : set) {
            paq paqVarB = z ? pioVar2.b() : pioVar2.a();
            z2 |= paqVarB != null;
            if (paqVarB != null) {
                ourVar.d(paqVarB);
            }
        }
        if (z2) {
            return ourVar;
        }
        ourVar.close();
        return null;
    }

    public final paq b() {
        return a(true);
    }

    public final synchronized pio c(peo peoVar) {
        for (pio pioVar : this.b) {
            if (pioVar.d().equals(peoVar)) {
            }
        }
        throw new IllegalArgumentException("Unknown stream " + String.valueOf(peoVar) + " requested for " + toString());
        return pioVar;
    }

    public final synchronized poe d() {
        return this.e;
    }

    public final synchronized poj e(peo peoVar) {
        List listF = f(peoVar);
        if (listF.isEmpty()) {
            return null;
        }
        return ((per) listF.get(0)).b;
    }

    public final synchronized List f(peo peoVar) {
        synchronized (this) {
            if (this.f >= this.b.size() && !this.h) {
                return c(peoVar).h();
            }
            int i = sbp.d;
            return sex.a;
        }
    }

    public final synchronized void g() {
        if (!this.h && !q()) {
            this.h = true;
            List list = this.d;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r((ojl) it.next());
            }
            list.clear();
        }
    }

    final void h() {
        paq paqVarA = a(false);
        if (paqVarA != null) {
            paqVarA.close();
        }
    }

    public final synchronized void i() {
        boolean z = true;
        int i = this.f + 1;
        this.f = i;
        Set set = this.b;
        if (i > set.size()) {
            z = false;
        }
        rnt.s(z);
        if (this.f == set.size()) {
            boolean zQ = q();
            List list = this.d;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.i.B((ojl) it.next(), false, false, null, false, null, true, zQ);
            }
            if (zQ) {
                list.clear();
            }
        }
    }

    public final synchronized void j(pdo pdoVar) {
        rnt.s(true);
        if (!this.h) {
            rnt.u(this.c == null, "FrameId should only be set once", new Object[0]);
            rnt.u(this.e == null, "setFrameId must ALWAYS come before setMetadata.", new Object[0]);
            rnt.t(true ^ this.g, "Metadata was already set for frame %s!", pdoVar);
        }
        this.c = pdoVar;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((pio) it.next()).j(pdoVar);
        }
        if (!this.h) {
            boolean zQ = q();
            List list = this.d;
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                this.i.B((ojl) it2.next(), false, true, this.c, false, null, false, zQ);
            }
            if (zQ) {
                list.clear();
            }
        }
    }

    public final synchronized void k(poe poeVar) {
        if (!this.h) {
            rnt.u(poeVar == null || this.c != null, "setFrameId must ALWAYS come before setMetadata.", new Object[0]);
            rnt.t(!this.g, "Metadata was already set for frame %s!", this.c);
            this.g = true;
            this.e = poeVar;
            boolean zQ = q();
            List list = this.d;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.i.B((ojl) it.next(), false, false, null, true, this.e, false, zQ);
            }
            if (zQ) {
                list.clear();
            }
        }
    }

    public final synchronized boolean l() {
        if (!q()) {
            if (!this.h) {
                return false;
            }
        }
        return true;
    }

    public final synchronized boolean m() {
        if (this.f != this.b.size()) {
            if (!l()) {
                return false;
            }
        }
        return true;
    }

    public final synchronized boolean n() {
        if (!this.g) {
            if (!l()) {
                return false;
            }
        }
        return true;
    }

    public final synchronized void p(ojl ojlVar) {
        boolean zQ = q();
        if (this.h && !zQ) {
            r(ojlVar);
            return;
        }
        if (!zQ) {
            this.d.add(ojlVar);
        }
        lat latVar = this.i;
        pdo pdoVar = this.c;
        latVar.B(ojlVar, false, pdoVar != null, pdoVar, this.g, this.e, this.f == this.b.size(), zQ);
    }

    public final synchronized String toString() {
        Long lValueOf;
        pdo pdoVar = this.c;
        lValueOf = pdoVar == null ? null : Long.valueOf(pdoVar.c);
        Objects.toString(lValueOf);
        return "Frame-".concat(String.valueOf(lValueOf));
    }
}
