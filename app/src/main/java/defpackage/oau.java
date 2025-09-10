package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oau extends oao {
    public final oat a;
    public obk c;
    private final obd d;
    private final obv e;

    protected oau(oar oarVar) {
        super(oarVar);
        this.e = new obv();
        this.a = new oat(this);
        this.d = new oas(this, oarVar);
    }

    public final void C() {
        this.e.b();
        this.d.d(((Long) obh.x.f()).longValue());
    }

    public final boolean D() {
        oak.a();
        z();
        return this.c != null;
    }

    public final boolean E(obj objVar) {
        ojl.ay(objVar);
        oak.a();
        z();
        obk obkVar = this.c;
        if (obkVar == null) {
            return false;
        }
        String strF = objVar.e ? obc.f() : obc.h();
        List list = Collections.EMPTY_LIST;
        try {
            Map map = objVar.a;
            long j = objVar.c;
            Parcel parcelA = obkVar.a();
            parcelA.writeMap(map);
            parcelA.writeLong(j);
            parcelA.writeString(strF);
            parcelA.writeTypedList(list);
            obkVar.A(1, parcelA);
            C();
            return true;
        } catch (RemoteException unused) {
            q("Failed to send hits to AnalyticsService");
            return false;
        }
    }

    public final void b() {
        oak.a();
        z();
        try {
            ojf.a().b(d(), this.a);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        if (this.c != null) {
            this.c = null;
            c();
        }
    }

    public final void c() {
        oam oamVarF = f();
        oamVarF.z();
        oak.a();
        oba obaVar = oamVarF.a;
        oak.a();
        obaVar.z();
        obaVar.q("Service disconnected");
    }

    @Override // defpackage.oao
    protected final void a() {
    }
}
