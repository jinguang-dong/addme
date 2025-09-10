package defpackage;

import java.util.Random;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class quc implements tzt {
    private final tzx a;
    private final tzx b;
    private final /* synthetic */ int c;

    public quc(tzx tzxVar, tzx tzxVar2, int i) {
        this.c = i;
        this.a = tzxVar;
        this.b = tzxVar2;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        int i = this.c;
        if (i == 0) {
            Set setQ = jsv.q((rwc) ((tzu) this.a).a, this.b);
            setQ.getClass();
            return setQ;
        }
        if (i == 1) {
            Object sfmVar = ((rwc) ((tzu) this.a).a).h() ? new sfm((qqs) this.b.a()) : sfd.a;
            sfmVar.getClass();
            return sfmVar;
        }
        if (i == 2) {
            tzx tzxVar = this.a;
            return new qux(((fkh) tzxVar).b());
        }
        if (i == 3) {
            return new qvh((Random) ((rwc) ((tzu) this.a).a).e((Random) this.b.a()));
        }
        if (i == 4) {
            return new ray(((imm) this.b).b(), (und) this.a.a());
        }
        if (i == 5) {
            return new rbg((rwc) ((tzu) this.b).a, ((tzv) this.a).a());
        }
        return new rbl(this.a);
    }

    public quc(tzx tzxVar, tzx tzxVar2, int i, char[] cArr) {
        this.c = i;
        this.b = tzxVar;
        this.a = tzxVar2;
    }
}
