package defpackage;

import android.app.backup.BackupAgentHelper;
import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.app.backup.SharedPreferencesBackupHelper;
import android.content.SharedPreferences;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.pairip.StartupLauncher;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class oug extends BackupAgentHelper {
    static {
        StartupLauncher.launch();
    }

    public static void c(SharedPreferences.Editor editor, String str, Object obj) {
        if (obj instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Float) {
            editor.putFloat(str, ((Float) obj).floatValue());
            return;
        }
        if (obj instanceof Integer) {
            editor.putInt(str, ((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            editor.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            editor.putString(str, (String) obj);
            return;
        }
        if (!(obj instanceof Set)) {
            Log.w("PersistentBackupAgentHe", "Skipping restore of key " + str + " because its value is the unrecognized type " + String.valueOf(obj != null ? obj.getClass() : null) + ".");
            return;
        }
        Set<String> set = (Set) obj;
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            if (!(it.next() instanceof String)) {
                Log.w("PersistentBackupAgentHe", "Skipping restore of key " + str + " because its value is a set containing an object of type " + String.valueOf(obj != null ? obj.getClass() : null) + ".");
                return;
            }
        }
        editor.putStringSet(str, set);
    }

    public static boolean d(String str) {
        return (str.contains(File.separator) || str.contains("/") || "persistent_backup_agent_helper".equals(str)) ? false : true;
    }

    private final void e() {
        getSharedPreferences("persistent_backup_agent_helper", 0).edit().clear().apply();
    }

    protected abstract Map a();

    protected final SharedPreferences b(String str) {
        return getSharedPreferences(str, 0);
    }

    @Override // android.app.backup.BackupAgentHelper, android.app.backup.BackupAgent
    public void onBackup(ParcelFileDescriptor parcelFileDescriptor, BackupDataOutput backupDataOutput, ParcelFileDescriptor parcelFileDescriptor2) throws IOException {
        Map mapA = a();
        SharedPreferences.Editor editorEdit = getSharedPreferences("persistent_backup_agent_helper", 0).edit();
        editorEdit.clear();
        for (Map.Entry entry : ((sbv) mapA).entrySet()) {
            String str = (String) entry.getKey();
            if (!d(str)) {
                throw new IllegalArgumentException(a.bw(str, "Unsupported shared preferences file name \"", "\""));
            }
            for (Map.Entry<String, ?> entry2 : b(str).getAll().entrySet()) {
                String key = entry2.getKey();
                c(editorEdit, str + "/" + key, entry2.getValue());
            }
        }
        editorEdit.apply();
        super.onBackup(parcelFileDescriptor, backupDataOutput, parcelFileDescriptor2);
        e();
    }

    @Override // android.app.backup.BackupAgent
    public final void onCreate() {
        addHelper("persistent_backup_agent_helper_prefs", new SharedPreferencesBackupHelper(this, "persistent_backup_agent_helper"));
    }

    @Override // android.app.backup.BackupAgentHelper, android.app.backup.BackupAgent
    public void onRestore(BackupDataInput backupDataInput, int i, ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        super.onRestore(backupDataInput, i, parcelFileDescriptor);
        SharedPreferences sharedPreferences = getSharedPreferences("persistent_backup_agent_helper", 0);
        HashMap map = new HashMap();
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            int iIndexOf = key.indexOf("/");
            if (iIndexOf < 0 || iIndexOf >= key.length() - 1) {
                Log.w("PersistentBackupAgentHe", a.bw(key, "Format of key \"", "\" not understood, so skipping its restore."));
            } else {
                String strSubstring = key.substring(0, iIndexOf);
                String strSubstring2 = key.substring(iIndexOf + 1);
                SharedPreferences.Editor editorEdit = (SharedPreferences.Editor) map.get(strSubstring);
                if (editorEdit == null) {
                    if (d(strSubstring)) {
                        editorEdit = b(strSubstring).edit();
                        map.put(strSubstring, editorEdit);
                    } else {
                        Log.w("PersistentBackupAgentHe", a.bw(strSubstring, "Skipping unsupported shared preferences file name \"", "\""));
                    }
                }
                c(editorEdit, strSubstring2, value);
            }
        }
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((SharedPreferences.Editor) it.next()).apply();
        }
        map.keySet();
        e();
    }
}
