package defpackage;

import android.content.ContentValues;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hqw {
    private static final sgv a = sgv.g("hqw");
    private final hqs b;
    private final hqx c;

    public hqw(hqs hqsVar, hqx hqxVar) {
        this.b = hqsVar;
        this.c = hqxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0073 A[Catch: all -> 0x01a8, PHI: r0
      0x0073: PHI (r0v19 rwc) = (r0v15 rwc), (r0v16 rwc), (r0v61 rwc) binds: [B:22:0x0077, B:19:0x006f, B:24:0x007c] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x01a8, blocks: (B:9:0x002b, B:20:0x0073, B:26:0x007f, B:28:0x0085, B:31:0x00a1, B:34:0x00ba, B:36:0x00c2, B:39:0x00c9, B:41:0x00e1, B:42:0x00f0, B:44:0x00fc, B:46:0x0114, B:48:0x0125, B:50:0x012b, B:54:0x0136, B:56:0x0142, B:64:0x0151, B:63:0x014e, B:70:0x016d, B:71:0x0174, B:66:0x0153, B:68:0x0160, B:78:0x0192, B:79:0x0199, B:88:0x01a7, B:87:0x01a4, B:83:0x019e, B:11:0x0055, B:14:0x005c, B:16:0x0063, B:19:0x006f, B:22:0x0077, B:23:0x007a), top: B:100:0x002b, inners: #0, #6, #7, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0085 A[Catch: all -> 0x01a8, TRY_LEAVE, TryCatch #3 {all -> 0x01a8, blocks: (B:9:0x002b, B:20:0x0073, B:26:0x007f, B:28:0x0085, B:31:0x00a1, B:34:0x00ba, B:36:0x00c2, B:39:0x00c9, B:41:0x00e1, B:42:0x00f0, B:44:0x00fc, B:46:0x0114, B:48:0x0125, B:50:0x012b, B:54:0x0136, B:56:0x0142, B:64:0x0151, B:63:0x014e, B:70:0x016d, B:71:0x0174, B:66:0x0153, B:68:0x0160, B:78:0x0192, B:79:0x0199, B:88:0x01a7, B:87:0x01a4, B:83:0x019e, B:11:0x0055, B:14:0x005c, B:16:0x0063, B:19:0x006f, B:22:0x0077, B:23:0x007a), top: B:100:0x002b, inners: #0, #6, #7, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a1 A[Catch: all -> 0x01a8, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x01a8, blocks: (B:9:0x002b, B:20:0x0073, B:26:0x007f, B:28:0x0085, B:31:0x00a1, B:34:0x00ba, B:36:0x00c2, B:39:0x00c9, B:41:0x00e1, B:42:0x00f0, B:44:0x00fc, B:46:0x0114, B:48:0x0125, B:50:0x012b, B:54:0x0136, B:56:0x0142, B:64:0x0151, B:63:0x014e, B:70:0x016d, B:71:0x0174, B:66:0x0153, B:68:0x0160, B:78:0x0192, B:79:0x0199, B:88:0x01a7, B:87:0x01a4, B:83:0x019e, B:11:0x0055, B:14:0x005c, B:16:0x0063, B:19:0x006f, B:22:0x0077, B:23:0x007a), top: B:100:0x002b, inners: #0, #6, #7, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0186  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.rwc a(long r10) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hqw.a(long):rwc");
    }

    public final void b(long j, hqp hqpVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("media_store_id", Long.valueOf(j));
        contentValues.put("special_type_id", hqpVar.e());
        hqr hqrVar = new hqr(contentValues);
        hqs hqsVar = this.b;
        swz.i(hqsVar.c, hqrVar, hqsVar.d);
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [sgt, shi] */
    public final void c(pos posVar, hqp hqpVar) {
        posVar.j();
        String lastPathSegment = posVar.b().getLastPathSegment();
        if (lastPathSegment != null) {
            try {
                b(Long.parseLong(lastPathSegment), hqpVar);
            } catch (NumberFormatException e) {
                ((sgt) ((sgt) a.c().i(e)).M((char) 1458)).s("Error applying SpecialType.");
            }
        }
    }
}
