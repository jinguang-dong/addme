package defpackage;

import java.util.Calendar;
import java.util.Date;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class skn extends sko {
    private final skm c;

    public skn(sia siaVar, int i, skm skmVar) {
        super(siaVar, i);
        this.c = skmVar;
        StringBuilder sb = new StringBuilder("%");
        siaVar.f(sb);
        sb.append(true != siaVar.d() ? 't' : 'T');
        sb.append(skmVar.G);
    }

    @Override // defpackage.sko
    public final void a(sks sksVar, Object obj) {
        skm skmVar = this.c;
        if (!(obj instanceof Date) && !(obj instanceof Calendar) && !(obj instanceof Long)) {
            sks.c(sksVar.d, obj, "%t" + skmVar.G);
            return;
        }
        sia siaVar = this.b;
        StringBuilder sb = new StringBuilder("%");
        siaVar.f(sb);
        sb.append(true != siaVar.d() ? 't' : 'T');
        sb.append(skmVar.G);
        sksVar.d.append(String.format(sih.a, sb.toString(), obj));
    }
}
