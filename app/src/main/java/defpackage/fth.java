package defpackage;

import com.google.android.clockwork.common.wearable.wearmaterial.list.CaNf.PJGqOKsIpSdZ;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fth implements tzt {
    private final tzx a;
    private final tzx b;
    private final /* synthetic */ int c;

    public fth(tzx tzxVar, tzx tzxVar2, int i) {
        this.c = i;
        this.a = tzxVar;
        this.b = tzxVar2;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        int i = this.c;
        return i != 0 ? i != 1 ? b() : b() : b();
    }

    public fth(tzx tzxVar, tzx tzxVar2, int i, byte[] bArr) {
        this.c = i;
        this.b = tzxVar;
        this.a = tzxVar2;
    }

    public final Executor b() {
        int i = this.c;
        if (i == 0) {
            return ((rnn) this.b.a()).b((Executor) this.a.a());
        }
        if (i != 1) {
            tzx tzxVar = this.a;
            pbc pbcVarA = ((pba) this.b).a();
            return new gpi(pbcVarA, new ouy(ojl.bZ(PJGqOKsIpSdZ.apDqB)));
        }
        tzx tzxVar2 = this.b;
        tzx tzxVar3 = this.a;
        return ((gno) tzxVar2.a()).g((Executor) tzxVar3.a());
    }
}
