package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class koh implements tzt {
    private final tzx a;
    private final tzx b;
    private final /* synthetic */ int c;

    public koh(tzx tzxVar, tzx tzxVar2, int i) {
        this.c = i;
        this.a = tzxVar;
        this.b = tzxVar2;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        int i = this.c;
        return i != 0 ? i != 1 ? i != 2 ? b() : b() : b() : b();
    }

    public final Boolean b() {
        int i = this.c;
        if (i == 0) {
            rwc rwcVar = (rwc) this.a.a();
            Map map = (Map) this.b.a();
            if (!rwcVar.h() && map.isEmpty()) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        if (i == 1) {
            return Boolean.valueOf(nvm.e != null && ((hbj) this.a.a()).p(gzb.c) && ((Boolean) ((owq) this.b.a()).dL()).booleanValue());
        }
        if (i != 2) {
            return Boolean.valueOf(((hef) this.a).b().booleanValue() && ((hbj) this.b.a()).p(haq.c));
        }
        Boolean bool = (Boolean) this.a.a();
        bool.booleanValue();
        gzi gziVar = hak.a;
        return bool;
    }

    public koh(tzx tzxVar, tzx tzxVar2, int i, byte[] bArr) {
        this.c = i;
        this.b = tzxVar;
        this.a = tzxVar2;
    }
}
