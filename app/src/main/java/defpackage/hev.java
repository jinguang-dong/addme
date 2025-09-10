package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hev extends dbz {
    @Override // defpackage.dbz
    protected final String a() {
        return "UPDATE OR ABORT `shots` SET `shot_id` = ?,`title` = ?,`start_millis` = ?,`persisted_millis` = ?,`canceled_millis` = ?,`deleted_millis` = ?,`most_recent_event_millis` = ?,`capture_session_type` = ?,`capture_session_shot_id` = ?,`pid` = ?,`stuck` = ?,`failed` = ? WHERE `shot_id` = ?";
    }

    @Override // defpackage.dbz
    protected final /* bridge */ /* synthetic */ void b(dey deyVar, Object obj) {
        hez hezVar = (hez) obj;
        deyVar.e(1, hezVar.a);
        String str = hezVar.b;
        if (str == null) {
            deyVar.f(2);
        } else {
            deyVar.g(2, str);
        }
        deyVar.e(3, hezVar.c);
        deyVar.e(4, hezVar.d);
        deyVar.e(5, hezVar.e);
        deyVar.e(6, hezVar.f);
        deyVar.e(7, hezVar.g);
        String str2 = hezVar.h;
        if (str2 == null) {
            deyVar.f(8);
        } else {
            deyVar.g(8, str2);
        }
        String str3 = hezVar.i;
        if (str3 == null) {
            deyVar.f(9);
        } else {
            deyVar.g(9, str3);
        }
        deyVar.e(10, hezVar.j);
        deyVar.e(11, hezVar.k ? 1L : 0L);
        deyVar.e(12, hezVar.l ? 1L : 0L);
        deyVar.e(13, hezVar.a);
    }
}
