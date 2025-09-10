package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class een implements Comparable {
    public String a;
    public String b;
    public een c;
    public List d;
    public eex e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    private List j;

    public een(String str, String str2, eex eexVar) {
        this.j = null;
        this.d = null;
        this.a = str;
        this.b = str2;
        this.e = eexVar;
    }

    private final List v() {
        if (this.d == null) {
            this.d = new ArrayList(0);
        }
        return this.d;
    }

    private final void w(String str) throws edv {
        if (!"[]".equals(str) && c(str) != null) {
            throw new edv(a.bw(str, "Duplicate property or field node '", "'"), 203);
        }
    }

    private final boolean x() {
        return "xml:lang".equals(this.a);
    }

    private final boolean y() {
        return "rdf:type".equals(this.a);
    }

    private static final een z(List list, String str) {
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            een eenVar = (een) it.next();
            if (eenVar.a.equals(str)) {
                return eenVar;
            }
        }
        return null;
    }

    public final int a() {
        List list = this.j;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final int b() {
        List list = this.d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final een c(String str) {
        return z(j(), str);
    }

    public final Object clone() {
        eex eexVar;
        try {
            eexVar = new eex(g().a);
        } catch (edv unused) {
            eexVar = new eex();
        }
        een eenVar = new een(this.a, this.b, eexVar);
        try {
            Iterator itH = h();
            while (itH.hasNext()) {
                eenVar.k((een) ((een) itH.next()).clone());
            }
            Iterator itI = i();
            while (itI.hasNext()) {
                eenVar.m((een) ((een) itI.next()).clone());
            }
        } catch (edv unused2) {
        }
        return eenVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return g().n() ? this.b.compareTo(((een) obj).b) : this.a.compareTo(((een) obj).a);
    }

    public final een d(String str) {
        return z(this.d, str);
    }

    public final een e(int i) {
        return (een) j().get(i - 1);
    }

    public final een f(int i) {
        return (een) v().get(i - 1);
    }

    public final eex g() {
        if (this.e == null) {
            this.e = new eex();
        }
        return this.e;
    }

    public final Iterator h() {
        return this.j != null ? j().iterator() : Collections.EMPTY_LIST.listIterator();
    }

    public final Iterator i() {
        return this.d != null ? new eem(v().iterator()) : Collections.EMPTY_LIST.iterator();
    }

    public final List j() {
        if (this.j == null) {
            this.j = new ArrayList(0);
        }
        return this.j;
    }

    public final void k(een eenVar) {
        w(eenVar.a);
        eenVar.c = this;
        j().add(eenVar);
    }

    public final void l(int i, een eenVar) {
        w(eenVar.a);
        eenVar.c = this;
        j().add(i - 1, eenVar);
    }

    public final void m(een eenVar) {
        String str = eenVar.a;
        if (!"[]".equals(str) && d(str) != null) {
            throw new edv(a.bw(str, "Duplicate '", "' qualifier"), 203);
        }
        eenVar.c = this;
        eenVar.g().f(32, true);
        g().v(true);
        if (eenVar.x()) {
            this.e.u(true);
            v().add(0, eenVar);
        } else if (!eenVar.y()) {
            v().add(eenVar);
        } else {
            this.e.w(true);
            v().add(this.e.c() ? 1 : 0, eenVar);
        }
    }

    protected final void n() {
        if (this.j.isEmpty()) {
            this.j = null;
        }
    }

    public final void o(int i) {
        j().remove(i - 1);
        n();
    }

    public final void p(een eenVar) {
        j().remove(eenVar);
        n();
    }

    public final void q() {
        this.j = null;
    }

    public final void r(een eenVar) {
        eex eexVarG = g();
        if (eenVar.x()) {
            eexVarG.u(false);
        } else if (eenVar.y()) {
            eexVarG.w(false);
        }
        v().remove(eenVar);
        if (this.d.isEmpty()) {
            eexVarG.v(false);
            this.d = null;
        }
    }

    public final void s() {
        int length;
        if (u()) {
            een[] eenVarArr = (een[]) v().toArray(new een[b()]);
            int i = 0;
            while (true) {
                length = eenVarArr.length;
                if (length <= i || !("xml:lang".equals(eenVarArr[i].a) || "rdf:type".equals(eenVarArr[i].a))) {
                    break;
                }
                eenVarArr[i].s();
                i++;
            }
            Arrays.sort(eenVarArr, i, length);
            ListIterator listIterator = this.d.listIterator();
            for (int i2 = 0; i2 < eenVarArr.length; i2++) {
                listIterator.next();
                listIterator.set(eenVarArr[i2]);
                eenVarArr[i2].s();
            }
        }
        if (t()) {
            if (!g().d()) {
                Collections.sort(this.j);
            }
            Iterator itH = h();
            while (itH.hasNext()) {
                ((een) itH.next()).s();
            }
        }
    }

    public final boolean t() {
        List list = this.j;
        return list != null && list.size() > 0;
    }

    public final boolean u() {
        List list = this.d;
        return list != null && list.size() > 0;
    }

    public een(String str, eex eexVar) {
        this(str, null, eexVar);
    }
}
