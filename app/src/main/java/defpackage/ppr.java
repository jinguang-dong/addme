package defpackage;

import android.content.ContentValues;
import android.content.Context;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ppr implements ppz {
    private final prh a;

    public ppr(prh prhVar) {
        this.a = prhVar;
    }

    @Override // defpackage.ppz
    public final ppw a(pqe pqeVar, ppu ppuVar) {
        ppx ppxVar = pqeVar.a;
        if (!ppxVar.b()) {
            return new pqg(this.a, pqj.l(pqeVar, ppuVar));
        }
        prh prhVar = this.a;
        a.I(pqeVar.c());
        ContentValues contentValues = new ContentValues();
        contentValues.put(ppuVar.e, String.format(Locale.ROOT, "%s.%s", pqeVar.c, pqeVar.d));
        String str = ppuVar.f;
        String str2 = pqeVar.e;
        contentValues.put(str, str2);
        String str3 = ppuVar.i;
        Context context = ppuVar.a;
        contentValues.put(str3, String.format(Locale.ROOT, "%s/%s", ppxVar.a(context).getName(), pqeVar.b));
        if (prh.z(str2)) {
            contentValues.put(ppuVar.j, Integer.valueOf(ppuVar.k));
        } else if (prh.A(str2)) {
            contentValues.put(ppuVar.j, Integer.valueOf(ppuVar.l));
        }
        contentValues.put(ppuVar.g, Integer.valueOf(ppuVar.h));
        return new pqf(prhVar, new pqh(pqeVar, context.getContentResolver(), contentValues, ppuVar));
    }

    @Override // defpackage.ppz
    public final ppy b(ppu ppuVar) {
        return new ppq(ppuVar);
    }
}
