package defpackage;

import android.content.Context;
import java.util.Random;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pov implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final /* synthetic */ int e;

    public pov(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i) {
        this.e = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        int i = this.e;
        if (i == 0) {
            tzx tzxVar = this.c;
            tzx tzxVar2 = this.b;
            Context contextB = ((imm) this.a).b();
            ppj ppjVarA = ((mfx) tzxVar2).a();
            return new qqq(contextB, contextB.getContentResolver(), ppjVarA);
        }
        if (i == 1) {
            return new pkd(((ozw) this.b).a(), (mdy) this.d.a(), (pbn) this.c.a(), ((pba) this.a).a());
        }
        if (i == 2) {
            Executor executor = (!((qnk) this.c.a()).d || ((rwc) ((tzu) this.d).a).h()) ? (Executor) this.a.a() : (Executor) this.b.a();
            executor.getClass();
            return executor;
        }
        if (i == 3) {
            return new qoz((qpf) this.d.a(), (qpj) this.a.a(), this.c, this.b);
        }
        if (i != 4) {
            return new qvu((Random) ((rwc) ((tzu) this.a).a).e((Random) this.d.a()), (qvh) this.b.a(), (swb) this.c.a());
        }
        ((jaf) this.a).b();
        quu quuVar = (quu) (((fkh) this.d).b().h() ? this.c : this.b).a();
        quuVar.getClass();
        return quuVar;
    }

    public pov(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, byte[] bArr) {
        this.e = i;
        this.b = tzxVar;
        this.d = tzxVar2;
        this.c = tzxVar3;
        this.a = tzxVar4;
    }

    public pov(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, char[] cArr) {
        this.e = i;
        this.b = tzxVar;
        this.a = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
    }

    public pov(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, int[] iArr) {
        this.e = i;
        this.a = tzxVar;
        this.d = tzxVar2;
        this.c = tzxVar3;
        this.b = tzxVar4;
    }

    public pov(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, short[] sArr) {
        this.e = i;
        this.d = tzxVar;
        this.a = tzxVar2;
        this.c = tzxVar3;
        this.b = tzxVar4;
    }

    public pov(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, boolean[] zArr) {
        this.e = i;
        this.a = tzxVar;
        this.d = tzxVar2;
        this.b = tzxVar3;
        this.c = tzxVar4;
    }
}
