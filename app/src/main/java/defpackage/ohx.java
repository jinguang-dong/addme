package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ohx extends ohm implements oeo {
    private static volatile Executor t;
    public final Set s;
    private final Account u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected ohx(Context context, Looper looper, int i, ohp ohpVar, ofu ofuVar, ogq ogqVar) {
        super(context, looper, ohz.i, odn.a, i, new rnu(ofuVar), new rnu(ogqVar), ohpVar.e);
        synchronized (ohz.a) {
            if (ohz.i == null) {
                ohz.i = new ohz(context.getApplicationContext(), context.getMainLooper());
            }
        }
        this.u = ohpVar.a;
        Set set = ohpVar.c;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.s = set;
    }

    @Override // defpackage.ohm
    public final odl[] E() {
        return new odl[0];
    }

    @Override // defpackage.ohm, defpackage.oeo
    public int a() {
        throw null;
    }

    @Override // defpackage.oeo
    public final Set h() {
        return n() ? this.s : Collections.EMPTY_SET;
    }

    @Override // defpackage.ohm
    public final Account r() {
        return this.u;
    }

    @Override // defpackage.ohm
    protected final void H() {
    }
}
