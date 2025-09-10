package defpackage;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import com.google.android.apps.camera.modeldownloader.uD.uCzt;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jnu implements mcw {
    private static final sgv a = sgv.g("jnu");
    private final Context c;
    private final ppj d;
    private final boolean f;
    private final mdy g;
    private final AtomicBoolean b = new AtomicBoolean(false);
    private final long e = (System.currentTimeMillis() / 1000) - 5;

    public jnu(Context context, ppj ppjVar, hbj hbjVar, mdy mdyVar) {
        this.c = context;
        this.d = ppjVar;
        this.g = mdyVar;
        this.f = hbjVar.p(gzz.A);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [sgt, shi] */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        try {
            if (this.b.getAndSet(true)) {
                return;
            }
            Context context = this.c;
            ContentResolver contentResolver = context.getContentResolver();
            String packageName = context.getPackageName();
            Bundle bundle = new Bundle();
            bundle.putInt("android:query-arg-match-pending", 3);
            bundle.putString("android:query-arg-sql-selection", "owner_package_name = ? AND date_added < " + this.e);
            bundle.putStringArray("android:query-arg-sql-selection-args", new String[]{packageName});
            Cursor cursorQuery = contentResolver.query(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "date_added"}, bundle, null);
            try {
                if (cursorQuery == null) {
                    ((sgt) a.c().M(2923)).s("Got null cursor while restoring videos");
                    return;
                }
                while (cursorQuery.moveToNext()) {
                    int i = cursorQuery.getInt(0);
                    long j = cursorQuery.getLong(1);
                    if (this.f) {
                        try {
                            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, i), "r", null);
                            if (parcelFileDescriptorOpenFileDescriptor == null) {
                                try {
                                    ((sgt) a.c().M(2920)).t("Could not inspect video id %d as openFileDescriptor returned null", i);
                                } catch (Throwable th) {
                                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                                        try {
                                            parcelFileDescriptorOpenFileDescriptor.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                    }
                                    throw th;
                                }
                            } else {
                                long statSize = parcelFileDescriptorOpenFileDescriptor.getStatSize();
                                if (statSize < 200000) {
                                    ((sgt) a.c().M(2919)).x("Not restoring video id %d since it is too small (size: %d)", i, statSize);
                                } else {
                                    try {
                                        FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                                        try {
                                            if (qep.b(fileInputStream).e("mdat").a.h()) {
                                                fileInputStream.close();
                                                parcelFileDescriptorOpenFileDescriptor.close();
                                            } else {
                                                ((sgt) a.c().M(2918)).t("Not restoring video id %d since it does not have an mdat box", i);
                                                fileInputStream.close();
                                            }
                                        } catch (Throwable th3) {
                                            try {
                                                fileInputStream.close();
                                            } catch (Throwable th4) {
                                                th3.addSuppressed(th4);
                                            }
                                            throw th3;
                                        }
                                    } catch (qeo e) {
                                        ((sgt) ((sgt) a.c().i(e)).M(2917)).t("Not restoring video id %d due to invalid boxes", i);
                                    }
                                }
                                parcelFileDescriptorOpenFileDescriptor.close();
                            }
                        } catch (FileNotFoundException e2) {
                            ((sgt) ((sgt) a.c().i(e2)).M(2916)).t("Could not inspect video id %d as the file is not found", i);
                        }
                    }
                    ppj ppjVar = this.d;
                    DateFormat dateFormat = ppjVar.l;
                    synchronized (dateFormat) {
                        str = dateFormat.format(Long.valueOf(TimeUnit.SECONDS.toMillis(j)));
                    }
                    String str2 = ppjVar.d + str + ".RESTORED";
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(uCzt.YyY, (Integer) 0);
                    contentValues.put("_display_name", str2);
                    contentResolver.update(ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, i), contentValues, null, null);
                    ((sgt) a.c().M(2922)).t("Published still-pending video id %s", i);
                    long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - j;
                    mdy mdyVar = this.g;
                    tpc tpcVarM = sqx.a.m();
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    tph tphVar = tpcVarM.b;
                    sqx sqxVar = (sqx) tphVar;
                    sqxVar.b |= 1;
                    sqxVar.c = seconds;
                    if (!tphVar.C()) {
                        tpcVarM.o();
                    }
                    sqx sqxVar2 = (sqx) tpcVarM.b;
                    sqxVar2.d = 3;
                    sqxVar2.b |= 2;
                    mdyVar.d((sqx) tpcVarM.l());
                }
                cursorQuery.close();
            } finally {
            }
        } catch (Throwable th5) {
            ((sgt) ((sgt) a.b().i(th5)).M((char) 2921)).s("Failed to publish still-pending videos");
        }
    }
}
