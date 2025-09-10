package androidx.work.impl;

import com.google.android.gms.analytics.EQvQ.UvOvSgfD;
import defpackage.cog;
import defpackage.dbx;
import defpackage.dcf;
import defpackage.dct;
import defpackage.dfe;
import defpackage.dxz;
import defpackage.dya;
import defpackage.dyb;
import defpackage.dyc;
import defpackage.dyd;
import defpackage.dye;
import defpackage.dyf;
import defpackage.dyg;
import defpackage.dyh;
import defpackage.dyi;
import defpackage.eay;
import defpackage.eba;
import defpackage.ebc;
import defpackage.ebe;
import defpackage.ebf;
import defpackage.ebh;
import defpackage.ebl;
import defpackage.ebo;
import defpackage.ebq;
import defpackage.ebr;
import defpackage.ebv;
import defpackage.eby;
import defpackage.ecr;
import defpackage.ecs;
import defpackage.ecv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    private volatile eby k;
    private volatile eay l;
    private volatile ecs m;
    private volatile ebh n;
    private volatile ebo o;
    private volatile ebr p;
    private volatile ebc q;

    @Override // androidx.work.impl.WorkDatabase
    public final ebr A() {
        ebr ebrVar;
        if (this.p != null) {
            return this.p;
        }
        synchronized (this) {
            if (this.p == null) {
                this.p = new ebv(this);
            }
            ebrVar = this.p;
        }
        return ebrVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final eby B() {
        eby ebyVar;
        if (this.k != null) {
            return this.k;
        }
        synchronized (this) {
            if (this.k == null) {
                this.k = new ecr(this);
            }
            ebyVar = this.k;
        }
        return ebyVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final ecs C() {
        ecs ecsVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new ecv(this);
            }
            ecsVar = this.m;
        }
        return ecsVar;
    }

    @Override // defpackage.dco
    public final dfe d(dbx dbxVar) {
        dct dctVar = new dct(dbxVar, new dyi(this));
        return dbxVar.c.a(cog.o(dbxVar.a, dbxVar.b, dctVar, false, false));
    }

    @Override // defpackage.dco
    protected final Map g() {
        HashMap map = new HashMap();
        map.put(eby.class, Collections.EMPTY_LIST);
        map.put(eay.class, Collections.EMPTY_LIST);
        map.put(ecs.class, Collections.EMPTY_LIST);
        map.put(ebh.class, Collections.EMPTY_LIST);
        map.put(ebo.class, Collections.EMPTY_LIST);
        map.put(ebr.class, Collections.EMPTY_LIST);
        map.put(ebc.class, Collections.EMPTY_LIST);
        map.put(ebf.class, Collections.EMPTY_LIST);
        return map;
    }

    @Override // defpackage.dco
    public final Set h() {
        return new HashSet();
    }

    @Override // defpackage.dco
    public final List u() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new dxz());
        arrayList.add(new dya());
        arrayList.add(new dyb());
        arrayList.add(new dyc());
        arrayList.add(new dyd());
        arrayList.add(new dye());
        arrayList.add(new dyf());
        arrayList.add(new dyg());
        arrayList.add(new dyh());
        return arrayList;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final eay w() {
        eay eayVar;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            if (this.l == null) {
                this.l = new eba(this);
            }
            eayVar = this.l;
        }
        return eayVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final ebc x() {
        ebc ebcVar;
        if (this.q != null) {
            return this.q;
        }
        synchronized (this) {
            if (this.q == null) {
                this.q = new ebe(this);
            }
            ebcVar = this.q;
        }
        return ebcVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final ebh y() {
        ebh ebhVar;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            if (this.n == null) {
                this.n = new ebl(this);
            }
            ebhVar = this.n;
        }
        return ebhVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final ebo z() {
        ebo eboVar;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            if (this.o == null) {
                this.o = new ebq(this);
            }
            eboVar = this.o;
        }
        return eboVar;
    }

    @Override // defpackage.dco
    protected final dcf a() {
        return new dcf(this, new HashMap(0), new HashMap(0), UvOvSgfD.HoNgKg, "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }
}
