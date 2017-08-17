# 15.11.0 (07/18/2016)

## Enhancements
* MITHRA-125 Reduce unnecessary blocking of weak reference eviction thread while cache write lock is held
* MITHRA-132 Introduce a class-level notification listener facility so applications can receive all notifications pertaining to a given Mithra class
* MITHRA-121 Add support to make tablespace configurable for UDB2 databases.
* MITHRA-123 Enhance update statements to insert in a temp table and then update via join.
* MITHRA-127 Adding metadata not found code to list of codes use on isConnectionDead lookup
* MITHRA-128 Avoid generating interfaces if is imported
* Various documentation cleanup



# 15.10.0 (02/04/2016)

## Enhancements
* MITHRA-117 allow "Function" as a class name
* MITHRA-118 allow the days to be added to businessDateTo to be settable

## Bugs
* MITHRA-116 Fix Mithra Middle Tier rollback due to timeout on the first operation in a transaction


# 15.9.6 (01/15/2016)

## Enhancements
* MITHRA-114 Generic facility for composing Mithra notification adapters with dupe detection
* MITHRA-108 MITHRA-115 add compressed binary file format for test data



# 15.9.5 (01/08/2016)

## Enhancements
* MITHRA-107 Optimise FastUnsafeOffHeapIntArrayStorage.unsafeZeroMemory
* MITHRA-108 Add as-of operations just before finder call and allow warning if max object threshold exceeded

## Bugs
* MITHRA-109 Fix invalid SQL resulting from multiple in-clauses in a mix of and() and or() operations
* MITHRA-110 fix parallel deep fetch processing all queued children


# 15.9.4 (12/31/2015)

## Enhancements
* MITHRA-103 Optimise MithraTimestamp.zFixInfinity by memoising results
* MITHRA-101 Ensure Mithra is binary compatible with GSC 5.x - 7.x
* MITHRA-102 Upgrade mithra-jtdsjbcp from 1.20.14 to 1.2.0.15, with unit test

## Bugs
* MITHRA-105 fix left filtered deep fetches with empty results
* MITHRA-104 Fix typos in FAQ and ConnectionManager logs.
* MITHRA-100 Preventative minor fixes to FastUnsafeOffHeapDataStorage

# 15.9.3 (12/09/2015)

Bugs
* MITHRA-93 Don't lose exception cause
* MITHRA-94 fix reindexing ops on lazy indices
* MITHRA-95 Fix 'missing page after current page' error during replication caused by empty pages at the end of the data buffer
* MITHRA-96 Fix race condition in replication which could lead to missing updates
* MITHRA-98 Fix FastUnsafeOffHeapLongList.clearAndCopy list size not updated and potential buffer overrun


# 15.9.2 (11/23/2015)

Bugs
* MITHRA-90 fix deep fetch across schemas
* MITHRA-91 fix NPE when deep fetching chained table via temp table
* MITHRA-92 fix off heap data allocation to zero out the allocated space


# 15.9.0 (11/02/2015)

## Enhancements
* MITHRA-83 Add byte[] support for MithraTestDataRowFormatter (used with DbExtractor)
* MITHRA-84 remove unused generated code
* MITHRA-87 cacheLoader: added thread pool level execution monitor
* MITHRA-89 created SqlLogSnooper and excluded log4j dependency.
* MITHRA-88 Update cache loader framework to support processing-temporal only objects.

## Bugs
* MITHRA-85 fix AIOOBE when replicating empty off heap string pool
* MITHRA-86 fix Postgres and MariaDb setMaxObjectsToRetrieve


# 15.8.0 (9/16/2015)

## Enhancements
* MITHRA-78 Improve JtdsBcpBulkLoader connection pooling
* MITHRA-80 add mithraobject.xsd to the generator jar
* MITHRA-81 better timestamp handling for db2

## Bugs
* MITHRA-82 ensure statements and result sets are closed when reading identity
* MITHRA-79 fix deep fetch for parent list with is-null left filter or no valid entries


# 15.7.1 (8/13/2015)

## Enhancements
* MITHRA-72 Upgrade Sybase ASE and IQ driver to jConnect 16.0 (JDBC 4)
* MITHRA-75 MithraDelimitedTestDataParser enhancement and code refactoring
* MITHRA-76 Enable apps to test their AdditionalOperationBuilder implementations with PostLoadFilterBuilder
* MITHRA-73 Make MithraTestResource.startTestDatabaseServer method protected

## Bugs
* MITHRA-77 fix wrong warning for computeFunction


# 15.7.0 (7/31/2015)

## Enhancements
* MITHRA-67 Refactor mithra generator to make ant dependency optional

## Bugs
* MITHRA-65 Add a workaround for a DB2 driver bug with timestamps
* MITHRA-66 fix result set handling for refresh with DB2
* MITHRA-68 Fix index out of bounds error during reading of MasterSyncResult
* MITHRA-69 fix deep fetch for parent list with no valid entries
* MITHRA-70 fix deep fetch in a mixed sourceless to (source or sourceless) set of children
* MITHRA-71 Fix max pk generator for postgres


# 15.6.2 (7/13/2015)

## Bugs
* MITHRA-64 fix adhoc source to sourceless relationship code paths that rely on temp tables


# 15.6.1 (7/13/2015)

## Enhancements
* MITHRA-59 Add support for optional prefix for Tibco RV notification
* MITHRA-62: Add support for compressed data files

## Bugs
* MITHRA-60 Fix off heap memory auto-deallocation
* MITHRA-61 fix deep fetch for to-one relationships that are not really to-one
* MITHRA-63 Fix adhoc deep fetch with null values in the parent


# 15.6.0 (6/19/2015)

## Enhancements
* MITHRA-54 Upgrade GWT version
* MITHRA-56 better log message while parsing test data
* MITHRA-52 Add MTLoader to Mithra
* MITHRA-53 Add gradle build documentation to Mithra FAQ

## Bugs
* MITHRA-51 Fix findByPrimaryKey calls for identical indexes to have parameters in correct order.
* MITHRA-55 Notification fixes for full cached objects:
* MITHRA-57 Fix "connection already closed" error when temp table creation fails during cursor retrieval
* MITHRA-58 fix source to sourceless relationship code paths that rely on temp tables



# 15.5.1 (6/8/2015)

## Enhancements
* MITHRA-47 Add getDatabaseIdentifier requirement to Notification documentation
* MITHRA-48 Adding stats collection for cursors
* MITHRA-50 put as of attributes at the end of temp tables for deep fetch

## Bugs
* MITHRA-49 fix tuple.in with sourceAttribute.in
* MITHRA-50 fix adhoc deep fetch for to-many relationships when mostly present in-memory


# 15.5.0 (5/4/2015)

## Enhancements
* MITHRA-41 Update FAQ to include antrun example.
* MITHRA-43 Optimize refresh SQL operation execution for dependent loader disabled with feature toggl
* MITHRA-38 Add variance population.
* MITHRA-32 Add standard deviation sample to AggregateAttribute.
* MITHRA-35 Add standard deviation population.
* MITHRA-36 Add variance sample.
* MITHRA-40 Add MariaDatabaseType.
* MITHRA-44 add guard for rapid inactivation in audit only objects
* MITHRA-45 Annotate foreign keys with metadata about owning relationships.

## Bugs
* MITHRA-39 fix sql query for deep fetch with equalsEdgePoint
* MITHRA-42 fix left join in deep fetch with equalsEdgePoint


# 15.4.2 (3/30/2015)

## Enhancements
* [MITHRA-30] Mithra documentation - maven users should use antrun
* [MITHRA-33] allow setting of replication schema name

## Bugs
* [MITHRA-28] fix connection leak when schema is not properly permissioned
* [MITHRA-29] fix query cache when deep fetching a single element uni-temporal object in a list
* [MITHRA-31] disable update via insert pending further testing
* [MITHRA-34] fix sql query for deep fetch with equalsEdgePoint


# 15.4.1 (3/5/2015)

## Enhancements
* [MITHRA-26] Allow subdirectories in Mithra class list

## Bugs
* [MITHRA-27] fix NPE when combining two MultiEqOperations become None


# 15.4.0 (3/2/2015)

## Bugs
* [MITHRA-22] fix relationship resolution for transactional objects with non-tx runtime config
* [MITHRA-23] don't throw NPE if set for in-clause has null in it
* [MITHRA-25] fix cursor connection release when connection dies unexpectedly


# 15.3.0 (2/13/2015)

## Enhancements
* [MITHRA-21] Throw an error if an xml contains identical indices.

## Bugs
* [MITHRA-18] fix deep fetch query cache clearing
* [MITHRA-19] Alter code generation to account for unique indexes that are identical to the primary key.
* [MITHRA-20] Ignore spaces in index definition



# 15.2.0 (1/23/2015)

## Enhancements
* artf629436 Add ddl generation support for Postgres and Oracle database types.
* artf628655 Improve performance for archive load into large off-heap cache
* artf629424 Optimize psort to use Arrays.sort
* artf629041 Expose deep relationship traversal logic from MithraObjectGraphExtractor
* artf628924 Add setter generation to MithraInterfaceTypes.
* artf629263 add an option for table sharding to the test resource

## Bugs
* artf629694 support Batch insert / Batch update in the same thransaction
* artf628801 Refactor MithraObjectGraphExtractor to traverse graph breadth first
* artf629756 fix batch update with the same object repeatedly updated
* artf629846 fix default values for null primitives


# 15.1.1 (12/10/2014)

## Enhancements
* artf627344 Refactor data extractor to build operations from mappers and to extract join and filter objects
* artf627366 Add Db2 Vendor Configuration and Tests.
* artf627916 CacheDataExtractor enhancements and additional test scenarios
* artf627367 Add year(), month(), and dayOfMonth() to DateAttribute and TimestampAttribute.

## Bugs
* artf627919 Fix addOrderBy to sort on AggregateList.
* artf627936 fix NPE with pure objects in a transaction
* artf628173 fix OrOperation where an operation simplifies to All


# 15.0.0 (10/03/2014)

## Enhancements
* artf624437 remove API and dependency on Caramel, Trove, PCJ
* artf624555 cacheLoader configuration to provide attribute for default factory for the dependent loader
* artf624787 Add new MithraConfigurationException and throw when object is not configured
* artf624808 Add CacheDataExtractor for extracting test data and related data
* artf624846 Add maxLength attribute check on mithra objects
* artf624970 Support load mithra cache from archive with filter
* artf625505 Add exception callback for the NotificationServer thread
* artf625227 Add String trim setting to AttributeMetaData.

## Bugs
* artf625293 Fix CacheDataExtractor to-many explosion bug and remove system property configuration
* artf624340 Fix Time Vendor Tests.
* artf625023 Add missing serial version UID's and small changes to cache extract code


# 14.11.0 (09/05/2014)

## Enhancements
* artf622929 Add detach copy methods to MithraDatedTransactionalList
* artf27255 ensure asGscList is generated for read only lists
* artf623331 Replace code formatter
* artf623332 Add Time Support
* artf27255 better template generation
* artf623877 Modify MithraDataTransformer interface to allow more control over data transformations
* artf624220 Capture transaction level performance data

## Bugs
* artf623121 FastUnsafeOffHeapDataStorage to handle the reallocate under OutOfMemory conditions
* artf623145 fix logs for null with bad data and prevent null insert to IQ via load
* artf624107 fix NullPointerException in linked mapper adhoc deep fetch
* artf624161 Ensure MithraTestResource restricted classes update cache controller on manager
* artf624398 fix adhoc deepfetch across multiple source attribute values


# 14.10.2 (07/25/2014)

## Enhancements
* artf622482 Create function to validate mithra objects against database table
* artf622637 Add expected statement results for Erules integration
* artf621474 tran support for multithreadedqueueloader
* artf27255 misc 
** add a toggle to H2DatabaseType to quote table names
** add serialVersionUID to set classes
** remove bad test dependency
** remove unused file
** test targets in build.xml
** update postgres driver to 9.3-1101-jdbc4
* artf622125 cleanup build libraries

## Bugs
* artf622060 FastUnsafeOffHeapDataStorage.getAllocatedSize to report allocated value
* artf622326 fix MappedAttribute not delegating isNullable() to wrapped attribute
* artf622695 fix or-clause with asOfAttribute sql generation problem


# 14.10.1 (05/30/2014)

## Enhancements
* artf619996 Simplify external ~MithraDataTransformer API
* artf620474 introduce ~LdapDataSourceProvider to abstract out the dependency on ~JndiJdbc
* artf620501 improve sybase like when no escape is required
* artf620610 optimize OR operations in cache with better parallelization
* artf27255 misc 
** faq update
** better error message

## Bugs
* artf620585 Incorrect GMT offset for older dates
* artf620592 fix ~FullUniqueIndex free slot calc
* artf620663 ensure drop table is called with TEMP_WRITE_FOR 



# 14.10.0 (05/19/2014)

## Enhancements
* artf619394 pass sourceAttribute into ~AdditionalOperationBuilder; use Object for sourceAttribute
* artf619469 Add a new test resource to do sanity check on cacheLoader.xml
* artf619546 Exposing ~TestDatabaseConfiguration on ~MithraTestResource

## Bugs
* artf619673 fix package imports for dependent dated relationships
* artf619850 fix importing EVO from a different package


# 14.9.0 (04/21/2014)

## Enhancements
* artf618165 Make ~FullUniqueIndex resistant to put/remove thrashing
* artf618410 Add retry to aggregate queries
* artf618345 Upgrade GS Collections to 5.0.0.Update GS Collections to 5.0.0.
* artf618493 Improve transaction batching for dated objects with multi-segment update

## Bugs
* artf618585 Fix adhoc small deep fetch for multi attribute relationships
* artf618694 Escape sql meta characters in contains, startsWith, endsWith and wildCardEq
* artf618794 Fix code generation for constant or clauses in relationships


# 14.8.1 (03/26/2014)

## Enhancements
* artf617478 add getDeepFetchTree to ~MithraList
* artf617680 Add access to show if an object is replicated at runtime

## Bugs
* artf616906 Fix Mithra SQL syntax issue with large in clauses
* artf617708 Make changes to improve Oracle compatibility. 
* artf617732 Fix oracle temp table usage
* artf27255 Misc: 
** Ensure ~EqualityMapper works with tests that setup different caching types for the same class
** Fix an assert in a test case


# 14.8.0 (02/28/2014)

## Enhancements
* artf615255 allow transactional objects to be configured as read only at runtime
* artf616645 ~CacheLoader Support for multidate load/refresh with fixed set of business dates.
* artf616740 remove "loadAdditionDate" API; improve loaded task monitoring
* artf616782 Improve overlap processor to support filter and cache renew
* artf27255 misc: 
** log rollback cause in all cases
** add dead connection detection for oracle
** misc: future proof test case

## Bugs
* artf615872 force close connections even if we think they are dead
* artf615994 - H2 cannot create temp tables within transaction
* artf616794 ensure full cached objects register for notification


# 14.7.1 (01/23/2014)

## Enhancements
* artf615115 Add retry for non-transactional cursor
* artf27255 Misc:
** Make RV network settable in Rv7MessagingAdapterFactory
** Set schema name the same way for driver and data source connections
** Add an error message when ~SimulatedSequence is defined by not used

## Bugs
* artf615114 Reduce on heap object life time for off heap configured cache
* artf615135 ~CacheLoader: de-reference objects after refresh complete
* artf615180 Override susbtituteOtherAttribute on ~AsOfEqOperation


# 14.7.0 (01/06/2014)

## Enhancements
* artf613229 Make asGscSet() return ~MutableIntSet instead of ~IntSet
* artf613311 ~CacheLoader optimize ~DependentKeyIndex iteration
* artf613901 ~CacheLoader thread pool performance improvements and shutdown sequence
* artf613903 ~CacheLoader config-time validation of the dependent relationships for ~AsOfAttribute and Source Attribute
* artf614113 Avoid creating pooled timestamp objects when serializing off heap data
* artf614127 Remove mithra dependency on asm via jarjar
* artf614132 Remove jzlib dependency
* artf614274 Generated code cleanup
* artf27255 Misc: 
** Fix backward compatibility with older Caramel versions
** Fix flickering test

## Bugs
* artf613274 Acquire readLock during ~AbstractCache.contains method
* artf613326 Fix false assert
* artf613757 Fix sql generation for mixed nondated and dated deep fetch #3
* artf614278 Fix dated not-exists full cache resolution


# 14.6.3 (12/04/2013)

## Enhancements
* artf611937 Use per-connection temp tables under more conditions
* artf612563 Allow Boolean on numeric columns on the Sybase IQ bulk loader
* artf612722 Allow Sybase "object not found" exceptions to be retried
* artf612979 Cacheloader performance improvement on large dataset
* artf27255 Misc:
** Added a test case
** Updating Mithra version from 14.6.2 to 14.6.3

## Bugs
* artf612092 Fix ~OffHeapSemiUniqueDatedIndex containsInNonDatedChained
* artf612105 Fix replication issues
* artf612874 Use ~DoProcedure3 to pass parameter into Filter2 on the *Index#contains method
* artf612970 Ensure ~ConcurrentFullUniqueIndex resizes appropriately
* artf613039 Fix sql generation for mixed nondated and dated deep fetch


# 14.6.2 (11/06/2013)

## Enhancements
* artf611450 Implement a more detailed transaction operation mode
* artf27255 Updating Mithra version from 14.6.1 to 14.6.2

## Bugs
* artf611394 ~LinkedMapper return wrong fromPortal ending on class cast exceptions
* artf611495 Constant*Set implementations should be Serializable
* artf611559 Fix handling of strings exceeding max length in queries with temp tables


# 14.6.1 (10/31/2013)

## Enhancements
* artf611176 ~CacheLoader Refresh: handle businessDate (timestampAttribute) to businessDate(asOfAttribute) type of relationships
* artf611249 Upgrade Mithra from Caramel 5.5.0 to 6.0.1
* artf27255 Misc:
** Cater for bad container code (JBoss)
** Updating Mithra version from 14.6.0 to 14.6.1

## Bugs
* artf610964 Fix deep fetch from non-dated to dated two levels down
* artf611006 Fix deep fetch on ad hoc list when it goes thru the ~LinkedMapper
* artf611024 Fix NPE in a transaction when cache TTL is set
* artf611070 ~PurgeAll for nullable primary keyed objects constructs incorrect sql
* artf611288 Fix replication issues


# 14.6.0 (10/21/2013)

## Enhancements
* artf607919 Adding a method in ~MithraArrayTupleTupleSet to take extra set of Extractors and dataholders
* artf608643 Add directory-based ~IntelliJ project files (.idea folder)
* artf609548 ~CacheLoader: improve performance of loading/refresh
* artf609871 Increase cacheloader task size from 1K to 10K
* artf610458 Apply syslog check for ~CacheLoader loading tasks
* artf610459 Use the Cache/index to postfilter dependent objects in refresh
* artf610460 Set the latest refresh time on the ~MithraObject portal
* artf610471 ~CacheLoader: do not refresh dependent objects for owners with updated OUT_Z
* artf610607 ~MithraTestResource enhancement for loadbcp to give ~DateFormat
* artf610691 ~CacheLoader: configuration driven number of threads for each connection pool and syslog checker
* artf610704 Implement offheap cache replication
* artf610726 Mithra object renewal based on operation + part 2 on reloading dependent objects
* artf610756 ~CacheLoader: unify load/refresh definitions of the tasks which need load by business date individually
* artf27255 Misc: 
** Small FAQ update: delete vs terminate vs purge
** Updating Mithra version from 14.5.0 to 14.6.0

## Bugs
* artf608298 Fix NPE in ~IntegratorMithraTxManager
* artf609884 Fix Notification bug causing stale data in cache
* artf609974 Fix assertion error in memory allocation
* artf610493 Ensure readFromArchive functionality is compatible with pure objects


# 14.5.0 (09/20/2013)

 *** Dependencies for Caramel, Trove, and PCJ will be removed September 2014 ***
Prior to that date, the old dependencies will be supported only in a deprecated form, and you are strongly encouraged to upgrade to Mithra 14.5 or later at your earliest convenience.

However, you should be able to recompile and test your project using Mithra 14.5 without any changes to your own code or XML, with only two minor exceptions:
* If you have used an ~IntSet in one of your Mithra object XMLs (typically as a parameter to a relationship), then Mithra imported bak.pcj.set.Intset for you.  With the latest version of Mithra, you must import that yourself:
** In the Mithra XML between the ~ClassName and ~DefaultTable tags, add:  <Import>bak.pcj.set.IntSet</Import>
** ~IntSet is the most common, however it is possible you used one of the other primitive collection types, and the same solution applies for all (and you may have multiple Import tags): ~BooleanSet, ~ByteSet, ~CharSet, ~DoubleSet, ~FloatSet, ~IntSet, ~LongSet, ~ShortSet
* If your code uses Mithra's ~ConstantIntSet or ~ConstantShortSet, then you will need to update the related code to use GS Collections collections immediately
** We expect this to be a very small percentage of users

Notes regarding the Caramel dependency elimination
Mithra is compatible with Caramel 2.x to 6.x. Some versions of Caramel were badly packaged and do not work correctly:  5.1.0 through 5.3.2 

~MithraList/~DomainList:
* asCaramelList(): either eliminate usage, or use asGscList()
* ~MithraList:
** eliminate any cast/usage of ~CaramelIterable
** eliminate any usage of these methods (from ~CaramelIterable):
*** doUntil(~DoUntilBlock<? super E>)
*** doWhile(~DoWhileBlock<? super E>)
*** forEach(Procedure<? super E>)
*** forEach(~VoidBlock<? super E>)
*** forEachWith(Procedure2<? super E, ? super P>, P)
*** forEachWith(~TwoArgumentVoidBlock<? super E, ? super P>, P)
*** forEachWithCursor(~DoWhileBlock)
*** forEachWithIndex(~ObjectIntProcedure<? super E>)
*** forEachWithIndex(~VoidBlockWithIndex<? super E>)

~AttributeValueSelector: change all reference of ~AttributeValueSelector to Function

~DbExtractor, eliminate usage of:
* public void addClassesToFile(List<? extends Pair<~RelatedFinder, Operation>> finderAndOpList) throws IOException

Notes regarding the Trove dependency elimination
* Eliminate any reference to the class ~TObjectProcedure. Equivalent methods are provided using either ~DoWhileProcedure or ~DoUntilProcedure.
* Eliminate any reference to ~TObjectHashingStrategy. It should be trivial to wrap legacy instances to provide this interface, but elimination is preferred.

Notes regarding the PCJ dependency elimination
* Mithra now requires GS Collections 4.0+ -- older versions do not contain the primitive collections features that Mithra now leverages
** GS Collections [4.0 release notes|http://openzone.services.gs.com/confluence/display/GSCOLLECT/4.0]
* In general, usages of the bak.pcj.set.* classes has been deprecated, replaced by GS Collections 4 primitive sets
* Deprecated methods that accept the PCJ API now create a small amount of garbage -- if you or your application is garbage-sensitive, you should refactor to use GS Collections versions of the API sooner rather than later. The new methods are fully optimized for reduced garbage and improved performance
* Any relationships (particularly parameterized) that relied on Mithra importing the PCJ classes will now require you explicitly import the type yourself and/or refactor to use GS Collection types
** To add an import to a Mithra object definition, add the following between the ~ClassName and ~DefaultTable tags:  <Import>com.gs.your.type.Here</Import>
* Any usages of the PCJ SetTo<primitive>SetAdapter classes should be refactored to use the GS Collections primitive Sets instead
* ~AggregateList now supports getAttributeAsGscIntSet() which returns a GS Collections ~MutableIntSet, which is analogous to the (now deprecated) getAttributeAsIntSet() PCJ version of the method
* The asGscSet() method on ~IntegerAttribute supersedes the (now deprecated) asSet() method:  e.g.:  ~UserFinder.profileId().asSet(userList)) becomes ~UserFinder.profileId().asGscSet(userList))
* The asSet(gscExistingSetToAppend) method on ~IntegerAttribute supersedes the (now deprecated) asSet(pcjExistingSetToAppend) method:  e.g.:  ~UserFinder.profileId().asSet(userList, pcjIntSet)) becomes ~UserFinder.profileId().asSet(userList, gscIntSet))

## Enhancements
* artf607919 Adding a method in ~MithraArrayTupleTupleSet to take extra set of Extractors and dataholders
* artf608080 Overload ~MithraTestResource#loadMithraConfiguration to accept ~MithraRuntimeType
* artf608520 ~JtdsBulkLoader enhancement
* artf608620 Close connection on "Run out of Locks" exception
* artf608643 Add directory-based ~IntelliJ project files (.idea folder)
* artf608644 Upgrade to GS Collections 4.0
* artf608957 Upgrade Mithra to use GS Collections for primitive sets instead of PCJ
* artf27255 Updating Mithra version from 14.4.1 to 14.5.0

## Bugs
* artf608298 Fix NPE in ~IntegratorMithraTxManager



# 14.4.2 (10/02/2013)

## Bugs
* artf609884 Fix Notification bug causing stale data in cache


# 14.4.1 (08/28/2013)

## Bugs
* artf607758 ~DateCluster support for multidate cacheload request
* artf27255 Misc changes:
** Updating Mithra version from 14.4.0 to 14.4.1
** Touching the files to ensure Hikari adds the latest revisions to the next build/tag


# 14.4.0 (08/27/2013) -- deprecated, see 14.4.1 for the fixed version

## Enhancements
* artf606674 Improve generated sql for count() for better performance
* artf606693 Improve serialization performance
* artf607602 ~DateCluster support for multidate cacheload request
* artf607603 Enable off-heap for pure objects
* artf607615 Improve TCP notification server/client by using a concurrent map
* artf607626 Upgrade JUnit from 3.8 to 4.11
* artf607671 ~CacheLoader: Initial load will only load records up to the initialLoadStartTime
* artf27255 Updating Mithra version from 14.3.1 to 14.4.0

## Bugs
* artf607672 Fix bug in fully caches join via relationships inside a transaction
* artf607692 Fix ~AndOperation bulk matching preference


# 14.3.1 (08/07/2013)

## Enhancements
* artf27255 Misc: Fix test case
* artf27255 Updating Mithra version from 14.3.0 to 14.3.1

## Bugs
* artf606159 Reset schema when returning connection for jtds bcp loader


# 14.3.0 (07/29/2013)

## Enhancements
* artf604991 Implement recursiveNotExists
* artf605709 Faster compression algorithm in cache archive and notification (jzlib will be removed 1/1/2014)
* artf605822 Add ignorePackageNamingConvention to ~DatabaseIndexValidator
* artf605938 Upgrade ~FreyaXML from 1.3.5 to 1.4.0
* artf27255 Updating Mithra version from 14.2.0 to 14.3.0
* artf604802 Cache micro-optimization


# 14.2.0 (07/09/2013)

## Enhancements
* artf602834 Convert internal usage of Trove and Caramel to GS Collections
* artf603517 Add zGetPrintablePrimaryKey to ~MithraDeletedException messages
* artf603623 Remove dependency on dbcp
* artf27255 Miscellaneous: Updating Mithra version from 14.1.0 to 14.2.0

## Bugs
* artf603088 Check for null connection manager in SQE waitForSysLog
* artf603145 Ensure default as-of operations added to relationships
* artf603349 Fix ~JtdsBcpBulkLoader hardcoded dependency on tempdb
* artf604616 fix ~ClassCastException in timestamp pool
* artf604654 fix incorrect query cache entry when defaulting as of attributes


# 14.1.0 (06/11/2013)

## Enhancements
* artf462731 Have copyDetachedValuesToOriginalOrInsertIfNew() return a reference to the found or created object
* artf600937 Better default for SQE when insert threads are zero
* artf601404 Ensure mithra archive load registers with notification service
* artf602005 Make ~JtdsBcpBulkLoader custom temp db aware
* artf602239 Implement free for off heap data storage
* artf27255 Miscellaneous:
** Fix flaky test
** Enhancement to DB2 performance entry
** Avoid IO wait in synchronized block
** Better error message
** Updating Mithra version to 14.1.0

## Bugs
* artf602145 Ensure database retrieve count is incremented when iterating with cursor
* artf602621 Fix infinity timezone conversion for temp tables
* artf602723 Fix ~IsNull or large In operation


# 14.0.2 (05/08/2013)

## Enhancements
* artf599521 Change Overlap classes to support Mithra runtime configs
* artf27255 Updating Mithra version to 14.0.2

## Bugs
* artf600299 Fix convert-to-database-timezone for infinity dates
* artf600400 Fix deepFetch bypassCache sometimes not clearing deleted objects
* artf599758 Fix NPE in ~SybaseDatabaseType


# 14.0.1 (04/23/2013)

## Enhancements
* artf568084: Off-Heap Dated Cache - work is now complete
* artf595174: Added methods in NullableColumn/MaxLen Validator that takes Collection as parameter
* artf595305: Implement single-row deletes for milestone overlap cleanup
* artf596380: Add flag in ~MithraTestResource to support/ignore unconfigured objects
* artf595493: Making change so that JNDI lookup return jdbc3 datasource, currently it returns jdbc2 datasource. jconn3*.jar has jdbc3 datasource
* artf595808: Implement new strategy for milestone overlap cleanup
* artf596585: Remove synchronized from the size calls on the ~FullSemiUniqueDatedIndex
* artf596804: Add partially milestoned objects to overlap fixing test
* artf597149: Adjust max SQL params for the sybase15 ~SybaseDatabaseType
* artf598180: Concurrency performance improvements
* artf598194: Make drop temp table exceptions non-fatal (just logged)
* artf598435: Deprecate ~DatabaseType.createBulkLoader(connection...) 
** Important: All users of this method should call the non-deprecated method without a connection
* artf598833: Improve timestamp pool performance
* artf599102: Add purgeAll Support for ~TransactionalAdhocFastList
* artf594489: Upgrade libs: 
** Caramel 5.3.1->5.3.3 
** (optional) GS-Collections 2.0.0->3.0.1
** Caramel 5.3.3->5.5.0
* artf596365: Library clean-up -- remove commons-beanutils
* artf596379: Library clean-up -- remove jdom-1.0
* artf27255: Miscellaneous:
** Small FAQ update: sqllogs entry
** Add a test case
** Fix flickering test
** Updating Mithra version to 14.0.1 
** Fixing references to joda-time-2.2
** Fix for badly behaved app servers randomly destroying thread groups

## Bugs
* artf597011: Fix timezone conversion near DST/EST switch time
* artf598038: Correctly handle exception in ~CacheLoader on the second to last task


# 13.12.0 (02/28/2013)

## Enhancements
* artf592376 Milestone overlap detection and fixing
* artf593322 Fix ~OverlapFixerTest so it can run in any timezone and add to suite
* artf592841 Use more global temp tables with DB2
* artf592955 More session table usage for Sybase and MS SQL
* artf593130 Optimize adhoc deep-fetch for small queries
* artf27255 Misc:
** Sanity check connection managers at the end of tests
** Commented some code
** Added an extension point to Sybase IQ bulk loader to allow for file transfer
** Fix Sybase delete top generated sql
** Better retry for Sybase ASE bulk insert
** Ensure nulls are not inserted in tuples for relationships
* artf27255 Updating Mithra version to 13.12.0

## Bugs
* artf593104 Inserts not ordered correctly for cascadeInsert()
** Added a warning (but does not fail) when object marked as a table-per-subclass superclass, but has no subclasses
* artf593115 Fix defaultIfNull for non-zero values in dated objects
* artf593428 Fix NPE in notification threads caused by portal re-initialization


# 13.11.0 (02/14/2013)

## Enhancements
* artf591153 For Sybase IQ, allow connection local temp tables
* artf591909 Adding overloaded validateIndices which takes List of ~MithraObjectTypeWrapper
* artf27255 Updating Mithra version to 13.11.0

## Bugs
* artf590064 Fix ~ClassCastException when using increment on ~BigDecimal attribute
* artf591168 Resolving a relationship on an ~AdhocList may result in duplicates
* artf27255 Misc:
** Fix test imports in build file
** Fix incorrect sorting of multiple as of attributes in a join


# 13.10.0 (01/24/2013)

## Enhancements
* artf27255 Misc: Added object methods to ~MilestoneRectangle utility class
* artf589647 Implement multidate refresh in ~CacheLoader

## Bugs
* artf589608 Check in override of ~ExplicitJoinClause from GLEW
* artf588648 ~MithraGen bug for parameterized getter using interface/implementation
** Now supports non-dated-txnl, and read-only dated and non-dated


# 13.9.0 (01/17/2013)

## Enhancements
* artf585302 Allow connection manager to provide table names
* artf583902 Configure Sonar,Jacoco
* artf27255 Misc:
** Inject H2 version number to POM template
** Code cleanup: remove unwanted dependencies
** Small FAQ additions: * Caching / Cache Invalidation
** Fixed graph generation for some many-to-many relationships
** Slight performance improvement
** Updating Mithra version to 13.9.0

## Bugs
* artf582823 Fix delete with inner join sql generated for Sybase database
* artf588114 Fix transactional data visibility
* artf586615 Fix transactional data visibility when data changes too fast
* artf587780 Make validation connection managers functionality configurable
* artf588648 ~MithraGen bug for parameterized getter using interface/implementation


# 13.8.0 (11/29/2012)

Note:  Libraries for testing were upgraded:
* H2 (used by ~MithraTestResource) upgraded from 1.1.118 to 1.3.169 -- [H2 release notes|http://www.h2database.com/html/changelog.html]
* Derby (used for internal Mithra testing only) upgraded from 10.8.2.2 to 10.9.1.0 -- [Derby release notes|http://db.apache.org/derby/releases/release-10.9.1.0.cgi]

## Enhancements
* artf580129 Improve ~SybaseDatabaseType.getSybase15Instance() searchable argument count
* artf580143 Improve transaction locking for optimistic audit only objects, with test case
* artf27255 Misc: fix db url for misc tests
* artf580746 Upgrade H2 and Derby Upgrade H2 and Derby, groundwork for enabling a new test for CRS
** H2 upgraded from 1.1.118 to 1.3.169
** Derby upgraded from 10.8.2.2 to 10.9.1.0
* artf579970 Implement ~MithraInterface Type
* artf27252 Upgrading version to 13.8.0

## Bugs
* artf578958 Fix setters that update local attributes from relationships, to handle properly null objects
* artf581403 Fixed bug in relationships on ~MithraInterface
* artf581584 Fix two large in-clauses and cursor in-clause splitting
* artf582005 AsOf-to-Timestamp mapping mixed SQL join bug
* artf582552 Fix relationship sets source attribute bug
* artf582665 Serialization of operation-based list with deepFetch or orderBy criteria
* artf582718 Fixed ~MithraTestResource bug to use full finder class name instead of short domainobject class name for comparing portal's connection managers
* artf582852 Make validation connection managers functionality configurable


# 13.7.0 (10/24/2012)

## Enhancements
* artf577386 Dual Notification Messaging
* artf578695 Support for multi date refresh in ~CacheLoader
* artf27255 New documentation -- Notification
* artf27255 Updating Mithra version to 13.7.0
* artf578699 Support for non-regional to regional dependency on cacheloader
* artf27255 Small FAQ update & related code simplification 
** Clean-up of ~PspBasedMithraRemoteServerFactory 
** Added doc for mithraruntime.xsd: cacheTimeToLive
* artf578704 Upgrade Mithra with "thin" GS Collections support and latest Caramel 
** GS Collection support can be activated by adding generateGscListMethod="true" to the attributes/parameters of the mithra-gen task in Ant 
** GS Collections 2.0.0 added 
** Caramel upgraded from 5.0.1 to 5.3.1 
** the finder-0.9.0 sources are now unrolled into Mithra source tree -- the finder JAR is no longer needed


# 13.6.1 (10/16/2012)

## Enhancements
* artf577410 Make comment generation configurable
* artf577612 Avoid compiling mithra ui if code does not change
* artf27255 Updating Mithra version to 13.6.1

## Bugs
* artf577808 Notification bug where terminate on one object did not affect related object


# 13.6.0 (10/10/2012)

Note:  GWT library dependency for Mithra UI has changed from 1.4.61 to GWT 2.4.0

## Enhancements
* artf575383 Enhance deep fetch to optimally retrieve and cache when processing detached objects
* artf572085 Enhance middle tier UI to allow it to display details from a remote mithra manager 
** GWT jars updated to version 2.4.0 to allow the usage of GET parameters
** The middle tier URL accepts a GET parameter, mithraManagerLocation, with the PSP location of the ~MithraCacheRemoteService you want to display the details from
* artf575878 Select specific columns from syscolumns in ~SybaseDatabaseType to avoid privilege issues
* artf27255 New documentation -- Mithra Middle Tier
* artf573726 Remove mithra setup from test that does not need it
* artf574553 Add Operation.zContainsMappedOperation()
* artf27255 Misc: added a unit test

## Bugs
* artf574887 Added logic to ensure precision and scale values are output for numeric columns in the table ddl generation
* artf574887 Adjusted values for numeric type columns to use data type of "number" which is Oracles type for numerics


# 13.5.1 (09/18/2012)

Note: A bug in some “equals” operation was discovered that, although hard to trigger, can return the wrong result from the query cache.  As a precaution, we strongly recommend all users of Mithra versions 13.0.0-13.5.0 to upgrade to 13.5.1 as soon as practical.

## Enhancements
* artf572457 Added Cache.archiveCacheWithFilter function
* artf569903 Modify ~MithraTestResource to support duplicate runtime configs
* artf569896 Update statistics on temp tables after bulk insert
* artf570425 Detect inconsistent connection managers for same object in ~MithraTestResource
* artf565149 Build filters for a subset of business dates
* artf573632 Support object transformation in ~DbExtractor
* artf27255 Small FAQ additions: 
** Bulk Insert of large varchar columns 
** Result-set paging 
** Mithra support for Views 
** Storing of large text values
** ~PrimaryKeyGenerator doc
** ~MithraTestSequenceObjectFactory - folded sourceId/deskId to reduce duplication
* artf573273 Mithra release version 13.5.1
	
## Bugs
* artf573093 Fix Sybase syslogs percent full
* artf573649 Fix ~MultiEqualityOperation equals ~RelationshipMEOp


# 13.5.0 (08/14/2012)

## Enhancements
* artf564696 Added debugging statement to mithra test resource
* artf564698 Skip owner key index creation for initial load in cache loader
* artf564473 Allow mithra classes to be generated with final getter methods
* artf565149 Build filters for a subset of business dates
* artf566492 Expose a Iterator from ~VerboseSerializer to read data objects from Stream
* artf567147 Ensure IQ load command inserts everything
* artf567443 Support for boolean logic in Filter
* artf567711 Map binary and varbinary datatypes to java byte[] and tinyint to short
* artf6952 Preliminary work for computed attribute
* artf568084 Preliminary work for off heap storage - timestamp precision
* artf568269 Add ~DbExtractor.addDataFrom(String sourceFile)
* artf568299 Upgrade Mithra version number from 13.4.2 to 13.5.0


# 13.4.2 (07/12/2012)

## Enhancements
* artf563930 improve full cache query resolution
* artf563946 Increase precision of double values printed by ~MithraTestDataRowFormatter
* artf563948 Ensure source-aware non-milestoned objects are supported in cacheloader


# 13.4.1 (07/06/2012)

## Enhancements
* artf562756 Add ~SybaseDatabaseType.getSybase15Instance() and set default threshold for in-clause to temp table join conversion
* artf562800 Improve memory footprint when creating loading tasks and dependent loaders
* artf562975 Allow specify prerequisites by ~AdditionalOperationBuilder
* artf562994 Implement tempContext.associateToCurrentThread for simple cases
* artf27255 Misc:
** Fix potential integer overflow when comparing
** Remove dependency on database timezone for UTC conversion
** Mithra version number changed to 13.4.1

## Bugs
* artf561935 Remove dependency on database timezone for UTC conversion


# 13.4.0 (06/28/2012)

## Enhancements
* artf561321 Added API to find duplicate records (records will same primary key and overlapping asOfAttributes) in cache.

## Bugs
* artf559217 Fix bug involving mutation of association on a detached object from null to something back to null again
* artf558103 Fix large in-clauses with or-clause combination
* artf558331 Fix ~NonUniqueIndex size and improve averageReturnSize
* artf559005 Fix adhoc deepfetch when most of the objects are already present
* artf559161 Fix single date column to as of attribute join for infinity dates
* artf561723 Fix aggregate query parameter in join issue
* artf27255 Misc: reset having clause for each query in a set
* artf27255 Misc: fix a potential concurrency issue with bulk loaders


# 13.3.0 (06/04/2012)

## Enhancements
* artf556686 reduce garbage of full cache dated of to-many relationships
* artf556941 add support for MS SQL
* artf556950 reduce memory size of ~MithraLists for common cases
* artf557239 reduce to-one parametrized relationship garbage

## Bug Fixes
* artf557243 fix constant in-operation initialization concurrency


# 13.2.0 (05/25/2012)

## Enhancements
* artf554522 Reinstate ~DbExtractor constructors
* artf554731 ~DbExtractor bug-fixes
* artf556277 Upgrade ~FreyaXML from 1.3.0 to 1.3.5

## Bug Fixes
* artf556056 fix non-dated to dated detached update-in place


# 13.1.0 (05/15/2012)

## Enhancements
* artf27255
** Small FAQ additions * Added entry for maven-mithragenxml-plugin * Added entry for repo information * Added entry for Mithra Index Reconciliation Tool * fixing ampersands in URL to AREA
** Misc: * better error message * prevent identity and as-of-attributes together
* artf550032 Prepare a POM for uploading with mithramiddletier.war
* artf550249 Make generated Finder ~AsOf infinity and default dates immutable and pooled
* artf551368 avoid asof equality creation in full cache relationship resolution
* artf552073 For full cache, make the query cache concurrent
* artf553129 reduce garbage of to-many relationships
* artf553852 Minor changes to Executors
* artf553996 reduce garbage of as-of-equality checking
* artf554120 Modify ~DbExtractor to support milestone merging
* artf554310 add finder convenience methods: findByPrimaryKey and other unique indices
* artf554517 ~DbExtractor modifications to support multiple classes and header

## Bug Fixes
* artf551371 Fix issue with syslog and schemas
* artf553859 fix generated code with a parametrized, over specified relationship


# 13.0.1 (04/17/2012)

## Enhancements
* artf541603: Add ~NullableColumnValidator
* artf544117: reduce ~RelationshipMultiEqualityOperation equals() garbage
* artf27255:
** fix jndi factory for newer versions of jndijdbc (2.5.x)
** package source for generated freya files
** fix typo
** add an overloaded method for better error reporting
** Small FAQ additions * DB2 performance options * Use of ~IntSet
* artf545272 Enhance file loading in mithra test resource to enable a "strict" mode where objects which have a source will be ignored by sourceless connection managers (and vice versa). This means that we can load both regional and non-regional objects from a single file using two different connection managers by loading in two passes with "strict" mode enabled.
* artf545445: Change to improve logging/error message on ~CacheLoaderConfig by explicitly catching ~IOException rather than exception. This enables better logging on the client side
* artf546441: allow parsing test data files from classpath or file system
* artf546454: Support of short primitive attributes in in-cluase right filters of the object relationships
* artf548882: Optimized (int, int) tuple handing in ~MithraArrayTupleTupleSet
* artf549221: Add syslog draining to ~SingleQueueExecutor

## Bug Fixes
* artf541602: fix jar-all dependencies
* artf545284: Correct pom dependency information
* artf549312: Fix ~AsOfAttribute to Timestamp relationships where the query included ~AsOfAttribute equality


# 13.0.0 (02/28/2012)

## Enhancements
* artf535767: Replace Jaxb with Freya 1.3.0
* artf539277: improve performance of to-many relationships in full cache
* artf27255: misc: include ~MithraRuntimeConfigVerifier in mithratestresource jar
* artf539611: cacheloader: Handle multiple relationships for the same owner/dependent object
* artf537470: 
** Add POM file generation, and upgrade some libraries 
** Added Ant target pom-all -- not triggered by any build yet 
** Upgrade from jta-spec1.0.1 to jta-spec-1.1 
** Upgrade derby and derbynet from 10.1.0.0 to 10.8.2.2 
** Upgrade from asm-3.1 to asm-3.2 
**  Including the generated POM files in the ZIP release files. 
** Upgrading jndijdbc from 2.2.0.1 to 2.5.2 
** Upgrading GS Integrator from 1.2beta to 1.8.0 
** Needed tiny patch gsintegrator-api-1.8.0-patch.jar for GS Integrator, as it missed packaging a nested class
* artf27255: misc: added a couple of constants for backward compatibility
* artf27255: misc: order extracted test data
* artf540594: Handle multiple equivalent operands in the ~AndOperation
* artf27255: Small FAQ addition -- Transaction Manager and Spring
* artf27255: Small FAQ additions * "Restoring" an audit-only dated object * Case-insensitive searching of a column

## Bug Fixes
* artf536990: fix NPE with ~MappedOperation with full cache in a transaction
* artf539579: fix multiple updateInPlace followed by terminate
* artf539285: changes to DBExtractor so that existing files are not tried to be recreated. needed so that we can append the CVS header before passing the file to DBExtractor


[Mithra Releases 11 to 12]
[Mithra Releases 9 to 10]
[Mithra Releases 1 to 8]

# ## Mithra Releases 11 Through 12

# 12.9.1 (01/26/2011)

## Enhancements
* artf527234: remove debug printout from ~CacheLoader classes
* artf531895: db index to Mithra reconciliation tool
* artf533058: Added region support for depend cache loader with multiple regional owners
* artf533077: Optimize not exists SQL, and SQL with joins and or-clauses
* artf27255: misc: better error handling in ~MithraParsedData
* artf27255: Small FAQ update -- ~ConnectionManager

## Bug Fixes
* artf531131: fix Sybase IQ rollback with temp tables


# 12.9.0 (12/15/2011)

## Enhancements
* artf523538: Support for null foreign keys. * Required to support Mojo functionality * See ~TestRelationshipsWithNullableFk for examples, and also the Mithra test objects: Firm[[RO], Person[[RO], and PersonAddress[[RO]
* artf523579: Upgrade commons-dbcp from 1.2.2 to 1.3 * Helps support a cleaner dependency path * Mithra version number upgraded from 12.8.0 to 12.9.0
* artf523847: Set the business date to even when greater than equals, not just greater (because we add one day)
* artf523867: Upgrade Caramel from 4.3.1 to 5.0.1 Also upgrade the following: * slf4j from 1.6.1 to 1.6.4 * log4j from 1.2.15 to 1.2.16 * fw-psp from 1.1.2 to 1.3.0
* artf525438: Cleanup Caramel calls in cacheloader, etc

## Bug Fixes
* artf521168: Fix aggregate list with source attribute and relationship
* artf525423: Fix cross database adhoc deep fetch
* artf525508: Call forceResolve on non-operation list iterate methods


# 12.8.0 (11/23/2011)

## Enhancements
* artf521031 Move ~ThreadPool setup into initialization part of cacheLoader
* artf513984 cacheloader: support for filter operation on the owner list side
* artf6952 start the implementation of computed attributes
* artf515353 enable tuple attribute with substring
* artf27255 Misc cleanup
* artf27255 misc: slight improvement in picking operation execution order

## Bug Fixes
* artf521127 fix Mithra XML generation from DB schema issues
* artf521168 fix aggregate list with source attribute and relationship
* artf519589 Fix read lock acquisition bug in ~AbstractDatedCache
* artf513867 ensure transaction flush before aggregate query
* artf514467 fix many-to-many relationship generation when importing


# 12.7.2 (10/24/2011)

## Enhancements
* artf27255 convenience methods asSet on ~IntegerAttribute

## Bug Fixes
* artf511724 fix NPE in multiple calls to deep fetch on an empty detached list
* artf511753 fix finally clauses in transaction reporting incorrect exception
* artf511687 Fix integer overflow when estimating result size
* artf512018 fix repeated multi-update of increment
* artf511795 cacheloader: Handling prerequisites for global->regional relationship


# 12.7.1 (10/07/2011)

## Bug Fixes
* artf505627 ~LazyIndex.evictCollectedReferences should not throw exception
* artf506260 Use number of attributes to determine best index ref when index is lazy
* artf508035 fix Finder.reloadCache() when called in a transaction
* artf508079 fixed an issue with dropping temp tables in h2
* artf509127 fix ~DbExtractor special character formatting


# 12.7.0 (09/22/2011)

## Enhancements
* artf499356 Add ~LazyIndex and initialize on demand
* artf499356 Wrap ~NonUniqueIndex with lazy wrapper in dated cache
* artf492481 Support for Aggregate Bean List Inflation for bean inheriting from another class or interface
* artf492571 parallelize full dated cache join
* artf502513 improve printable primary key error message
* artf82213  Libraries refresh: * commons-beanutils: 1.7.0 -> 1.8.3 * commons-pool: 1.4 -> 1.5.4 * slf4j-api: 1.5.6 -> 1.6.1 * slf4j-log4j12: 1.5.6 -> 1.6.1 * fwbase 19.3.0 -- removed * fs-psp 1.1.2 -- added * caramel: 3.0.4 -> 4.3.1 * joda-time: 1.6.0 -> 2.0
* artf503980 Performance improvement for cacehLoader refresh process
* artf495109 better queries for cache loader refresh
* artf27252  misc: initialize classes that use Atomic*Updater
* artf27252  misc: ensure cache line conflict is not optimized out

## Bug Fixes
* artf493923 fix ~IndexOutOfBoundsException in ~MithraCompositeListQueue
* artf492067 Fix concurrency issue on the ~CacheLoaderEngine
* artf495069 fix NPE under rare circumstances of rollback of an object
* artf495281 Modify H2DatabaseType not to allow to drop tables in transaction
* artf497293 ~MithraObjectTypeWrapper.pkIndex not correctly set for inheriting classes
* artf503930 Validate mithra class definition XML
* artf504266 fix max pk generator deadlock
* artf491365 update to jtdsjbcp 1.2.0.14 - fix double to numeric conversion
* artf503813 fix removeAll methods of indices


# 12.6.1 (08/08/2011)

## Bug Fixes
* artf490232 fix concurrency issue with ~MithraCompositeList.getBalancedLists


# 12.6.0 (08/03/2011)

## Enhancements
* artf270555 Support for Bean Inflation In Aggregation
* artf476967 allow in-clause for source attribute across relationships with normal source equality
* artf479634 improve parallelization scaling
* artf487773 improve concurrency of ~ConcurrentDatedObjectIndex and ~ConcurrentWeakPool
* artf481866 Handle relationships with "dangling" constraints
* artf487861 add forEachWithCursor with an extra filter parameter
* artf437008 Introduced configuration support for turning off mithra retry for connection killed exception
* artf488248 Add leftFilter from relationship to the refresh task on the ~DependentLoaderFactoryImpl
* artf27255 misc: better warning message
* artf479737 misc: Adjust Log levels for ~CacheLoader

## Bug Fixes
* artf480256 Change Sybase IQ Loader to include the Schema in the table name.
* artf487695 trim strings after truncating


# 12.5.0 (07/05/2011)

## Enhancements
* artf468317 optimize ~AggregateData memory footprint, serialization
* artf467080 Ensure correct temporal container is imported in audit-only and business-only pure object factories.
* artf455717 Enhance error message on ~DatedIndex
* artf458057 increase mithra.jdbc.programid length to 30
* artf460361 improve performance/parallelize for cache lookups
* artf465133 add getNonPersistentGenericCopy to ~MithraList
* artf468317 optimize ~AggregateData memory footprint, serialization
* artf468450 add retry to temp table creation for sybase bcp
* artf463910 Add qualified loading with additional operations and dependent classes
* artf471253 use literal big decimal values in range queries
* artf472447 add utility classes to help with inactivate for archiving loader
* artf27255 misc: better error cause initialization
* artf27255 misc: ensure dropping temp table does not require extra connection
* artf27255 misc: make temp schema name settable for DB2
* artf27255 misc: add all the operation types to log analyzer
* artf466356 misc: Update Mithra FAQ & other documentation 

## Bug Fixes
* artf455091 fix lost connection in rare cases
* artf369517 fix Refresh of domain class with only primary key field(s) causes exception
* artf462230 Fix regional->nonregional relationship region handling
* artf465338 fix NPE when enrolling an out_z'ed object optimistically
* artf467847 fix generation of relationship with constant constraints across imports


# 12.4.2 (05/10/2011)

## Enhancements
* artf452786 Add monitoring tool to Mithra Cache Loader
* artf453188 Support for extracting query parameters to database performance listener
* artf454067 reduce used threads in ThreadConservingExecutor

## Bug Fixes
* artf449983 fix MultiInOperation ArrayIndexOutOfBoundsException
* artf452790 Fix shutdown process for the CacheLoader engine
* artf452791 Fix multi threaded access to the stripes on the DependentCusror for CacheLoader engine
* artf453104 Allow relationship joining as-of attribute to timestamp
* artf454069 don't mark relationship navigations from lists for relationship query caching


# 12.4.1 (04/19/2011)

## Enhancements
* artf447742 improve full cache resolution of multi-in

## Bug Fixes
* artf447741 fix filtered mapper interacting with equal non-filtered mapper
* artf447741 fix temp table joins with multiple source attributes in a single query


# 12.4.0 (04/11/2011)

## Bug Fixes
* artf445026 fix ClassCastException when setXXX(null) called twice


# 12.3.1 (04/07/2011)

## Bug Fixes
* artf443978 fix in-clause substitution with temp table sql generation


# 12.3.0 (04/06/2011)

## Enhancements
* artf442401 add setForceImplicitJoin to MithraList
* artf442972 add eqWithTrim to StringAttribute
* artf42520 implement OrderBy For AggregateList
* artf437008 Introduced configuration support for turning off mithra retry for connection killed exception
* artf437028 Relax mithraobject.xsd to allow pure objects-only configurations.
* artf27255 fix 1 thread mode for SQE
* artf27255 add setBatchSize to SimulatedSequence pk generator
* artf439223 improve monitoring info about LoadingTask
* artf439225 Dynamically build operation for tasks with prerequasites
* artf431267 Implement ordering of the Tuple in clause indexes in cache loader
* artf439225 Dynamically build operation for tasks with prerequasites
* artf440974 Handle cross-region dependencies on the cache loader
* artf441178 Handle dependent object loading with left filter on filtered mapper.

## Bug Fixes
* artf441118 PureObjectConfig should be marked as full cache
* artf441466 fix thread pool deadlock
* artf441496 fix deep fetch from non-dated to dated with default values
* artf442427 fix sql generation with temp table and or clause
* artf442500 fix dated to non-dated sql join order
* artf442874 fix cache expiration resetting for dated objects
* artf442924 sort as of attributes consistently during code generation
* artf443022 fix query across a mix of partial and full dated caches
* artf443121 fix many-to-many notExists with as of attribute propagation
* artf443531 update to jtdsjbcp 1.2.0.13 (date field from timestamp fix)
* artf443614 fix detached cascadeTerminate
* artf439221 Fix striped queue/index count handling


# 12.2.1 (03/11/2011)

## Enhancements
* artf431267 Implement ordering of the Tuple in clause indexes in cache loader
* artf402862 don't aggregate inner joins when not necessary with a FilteredMapper
* artf402862 use distinct instead of group by for most derived tables

## Bug Fixes
* artf431262 fix expunging of the entries on weak pool
* artf433203 Correctly count uniqueueSize on the NonUniqueIdentityIndex
* artf433647 fix sending notifications with other transaction managers


# 12.2.0 (03/07/2011)

## Enhancements
* artf426683 Apply a supplemental hash function in FullSemiUniqueDatedIndex and FullUniqueIndex
* artf426765 improve cache update speed for large updates (e.g. load from archive)
* artf431707 Support for stats listener
* artf431267 Implement ordering of the Tuple in clause indexes in cache loader
* artf27252 add a couple of utility methods to SingleQueueExecutor
* artf27252 add periodic expunging of dated weak references
* artf27252 misc: better error message

## Bug Fixes
* artf426733 fix moving a detached object and deleting original parent
* artf427845 fix large in-clause with aggregate queries
* artf428677 fix 2 large in-clauses on related object exception
* artf431066 fix code generation bugs with generateInterface=true
* artf431262 Correct expunging of the entries on resized part of the index
* artf402862 fix unnecessary aggregation within an or-clause
* artf27252 ensure proper close call on a connection if it's killed in a transaction
* artf402862 fix left join with or/in and deep dated-non-dated join


# 12.1.1 (02/11/2011)

## Enhancements
* artf420937 optimize tuple.in by using constant factorization
* artf27252 misc: updated tutorial code
* artf27252 misc: added isClassConfigured method to MithraConfigurationManager
* artf27252 misc: better logging of remote operations
* artf421061 added AdditionalOperationBuilder for CacheLoader framework

## Bug Fixes
* artf421863 fix NPE in DatedDetachedDeletedBehavior


# 12.1.0 (02/01/2011)

## Enhancements
* artf411986 implement source attribute queries with MultiInOperation
* artf412467 Add an ant task to fill in maxLength for String fields from existing databases
* artf415603 minor improvements to db extractor
* artf416972 support in-place-update followed by terminate for detached objects
* artf417061 improve NonUniqueIndex remove performance
* artf418158 reduce amount of generated code
* artf402881 build loading framework for fakefull caches
* artf27255 added support for additional h2 parameters

## Bug Fixes
* artf410868 fix in-memory aggregation ClassCastException
* artf402862 fix left join with or/in and deep dated-non-dated join
* artf418504 fix deep triangle join
* artf410876 fix temp table index creation on Db2 SESSION schema
* artf411095 Fix Finder.getRelationship for deep relationships
* artf411493 fix sybase temp table creation for booleans
* artf411549 ensure concurrent weak pool always uses the factory value
* artf68658 ensure consistent caching for deep fetches that are resolved from existing queries
* artf27255 better error message
* artf27255 fix bad test
* artf27255 fix equals and hashcode for arithmetic calculators
* artf27255 fix sourceforge upload task issue
* artf27255 removed max precision in the generator


# 12.0.0 (01/03/2011)

## Enhancements
* artf402862 replace exists with left/inner join in sql queries
* artf402883 convert in-clause to temp table join above threshold for IQ
* artf405301 add support for Postgres
* artf405133 deep fetch in parallel for operation based list
* artf407258 add operation toString for debugging assistance
* artf402881 create CacheLoader to load data into fakefull caches based on the DataSetLoader tasks, defined by the caller.
* artf402935 enhance object xml generator: add relationships via foreign keys and more configurable parameters
* artf407514 parallelize as of filter for large index results
* artf408024 build with JDK 1.6 (jar is 1.5 compatible)
* artf27255 misc: better error message
* artf27255 misc: better index name shortening
* artf27255 misc: code formatting
* artf27255 misc: slightly lower memory usage by linear array growth
* artf407530 add db2 test cases


# 11.9.2 (11/30/2010)

## Bug Fixes
* artf398770 fix deadlock when enrolling objects in transaction
* artf27255 fix remove from NonUniqueIdentityIndex


# 11.9.1 (11/10/2010)

## Enhancements
* artf382748 add in(aggregateList) to tuple attribute
* artf382358 Make AutoShutdownThreadExecutor implement Executor
* artf27252 misc doc improvement

## Bug Fixes
* artf391025 fix attribute substitution for In operation
* artf391091 fix moving a detached child to a brand new parent
* artf27255 fix db2 18 char limit
* artf27255 fix timezone conversion of null


# 11.9.0 (10/12/2010)

## Enhancements
* artf374623 enforce index and constraint name length limits for DB2
* artf374957 better concurrency when creating connections
* artf375889 ensure forceResolve causes an ahdoc list to deep fetch
* artf380402 Improve full cache performance for complicated or-clauses

## Bug Fixes
* artf375887 fix tuple temp tables in optimistic transactions
* artf377233 fix ArrayIndexOutOfBoundsException when doing many updateUntil on the same objects
* artf378020 make parent.setChild consistent with child.setParent for a one-to-one relationship
* artf380840 ensure insert and delete/terminate is using cascade behavior when relationships are modified
* artf380873 fix Sybase IQ cross schema temp table usage
* artf27255 fix potential threading conflict in MithraAbstractObjectPortal
* artf27255 set max unions to 1 for IQ, add test case for adhoc deep fetch for IQ


# 11.8.0 (09/19/2010)

## Enhancements
* artf372545 add support for Oracle 
* artf355523 JavaDoc comments for generated relationships 
* artf372677 add support for IQ xml generation 
* artf373907 get Sybase IQ metadata using plain jdbc 
* artf27255 set max clauses to 2000 for IQ 

## Bug Fixes
* artf368177 update metadata discovery sql for ASE15 
* artf373055 fix bcp file loading for source attributes in MithraTestResource 
* artf373811 fix code generation for readonly interfaces with transactional objects 
* artf372566 Fix bug with clear() in PartialPrimaryKeyIndex 


# 11.7.0 (08/18/2010)

## Enhancements
* artf361079 ensure 18 char max on DB2 index names
* artf361148 cascade isDeletedOrMarkedForDeletetion on dependent objects
* artf362163 allow moving dependent children between detached parents
* artf363028 add info messages for potentially bad relationships
* artf363078 exclude source attribute from direct reference checking
* artf363436 Add notEmpty() to MithraList
* artf364812 add wildCardEq, wildCardNotEq and wildCardIn for strings
* artf27255 misc: update to Caramel 3.0.4

## Bug Fixes
* artf364456 fix bad sql generation with notExists and deep fetch


# 11.6.1 (07/30/2010)

## Enhancements
* artf356389 Improve full cache performance and reduce temporary garbage
* artf357720 improve full cache query resolution by better index utilization
* artf27255 misc: add a documentation note
* artf358395 update Mithra grapher to fix some issues and display useful info
* artf358896 implement transitive propagation to enable better index utilization

## Bug Fixes
* artf356388 make sure executor finishes when an exception happens
* artf356832 Test harness does not cope well with Db objects in different schemas, remember table names rather than DB objects
* artf357684 as of attribute insertion can fail


# 11.6.0 (07/13/2010)

## Enhancements
* artf27255 misc: create the publish dir for junit
* artf353160 improve relationship resolution performance
* artf27255 misc: added protected getter for subclasses of ~ConnectionManagerForTests

## Bug Fixes
* artf350068 fix chunk length calculation in parallel tasks


# 11.5.0 (06/28/2010)

## Enhancements
* artf27255 misc don't close the output stream when writing archive
* artf336264 Implemented inMemoryNonTransactional support
* artf337369 retry ldap lookup if connection to db fails
* artf337499 better concurrency in ~MithraList
* artf348228 Improve full cache performance and reduce memory


# 11.4.2 (06/10/2010)

## Bug Fixes
* artf344113 fix temp table creation on db2
* artf344158 fix adhoc deepfetch NPE


# 11.4.1 (06/09/2010)

## Bug Fixes
* artf343673 fix concurrency issue with rapid 3-tier commits
* artf343678 fix ad hoc deep fetch with empty results


# 11.4.0 (05/18/2010)

## Enhancements
* artf336775 add tuples and tuple in operation
* artf336264 Implemented inMemoryNonTransactional support
* artf334355 improve full cache performance for large results and complex operations
* artf333466 optimize fast path relationship look up in full cache mode for missing relationships
* artf333460 improve performance by reducing calls to findForRange
* artf333105 improve performance of mapped operations in full cache mode
* artf27255 misc: make sure temp object cache is cleared in a transaction even under failure
* artf27255 misc: better log message
* artf27255 misc: better error message

## Bug Fixes
* artf27255 misc: fix valueOf method when traversing multiple levels of to-many relationships
* artf336981 fix timezone serialization with aggregate objects
* artf335726 fix destroying of temp object context in case of a failure in the transaction
* artf333188 fix timeout issue when using multiple middle tiers
* artf325530 Don't replace the Mithra configuration manager in the default case


# 11.3.3 (04/26/2010)

## Enhancements
* artf328079 Generified ~TransactionalCommand return type.
* artf327715 better transactional cache utilization for none caches

## Bug Fixes
* artf327710 fix concurrency issue with And.combineOperands
* artf329335 add caramel iterable for non-unique index set like lists


# 11.3.0 (04/13/2010)

## Enhancements
* artf326223 Implement ~UpdateListener. See xsd and javadoc.
* artf325530 Migrate changes from Reg BSW testing project
* artf326258 added more concurrent non-LRU query index for full caches
* artf327045 ensure detachedList.removeAll works with overriden equals method
* artf326226 reduce garbage creation when registering for notification
* artf27255 misc: add the finder api to the javadoc
* artf27255 misc: minor improvements to the relationship parser
* artf27255 misc: remove spurious extra blank line in generated code

## Bug Fixes
* artf325808 fixed partial cache can throw ~NegativeArrayIndexException
* artf27255 misc: fix loading hook for dated pure objects


# 11.2.2 (03/24/2010)

## Enhancements
* artf321060 Unlimited the String/varchar maxLength (was a limit of 255).

## Bug Fixes
* artf314874 fix pure object full cache load after forEachWithCursor refactoring


# 11.2.1 (03/20/2010)

## Enhancements

* artf314874 enhance forEachWithCursor: 3-tier implementation with parallel reading & better cache behavior (weak indices)
* artf27255 added serial uuid to ~MithraTimestamp & test case

## Bug Fixes
* artf316831 fix EVO with Audit Only dated object
* artf320050 pool timestamps when deserializing
* artf320433 fix full cache non-dated to dated mapped operation


# 11.1.0 (02/23/2010)

This marks the 100th release of Mithra on Sourceforge.

## Enhancements

* artf308524 Implement relationships on embedded value objects
* artf27255 slight improvement to relationship parsing

## Bug Fixes
* artf310552 fix sorting list based on attribute chains for EVOs
* artf264809 ensure list mutator methods are hooked for add/remove handling


# 11.0.1 (02/09/2010)

Two minor API changes: 
* The connection manager no longer throws ~InitializeException. If you were catching this before, there is no need to do that now.
* The abstract generated domain objects no longer expose a getLogger() method. If you were using that, you should add a logger to your concrete class instead.
    
Both changes will result in compile time failures, so there is no risk of putting bad code into production.

The major change in 11.0.0 is the introduction of ~CaramelIterable as a supported interface on ~MithraList. We've removed the dependency on fwbase, but we depend on Caramel and slf4j instead.

## Enhancements

* artf305339 switch to slf4j and remove dependency on fwbase. remove versionId
* make getLogger in abstract class private

* artf264809 added Caramel 2.1.0 jars and switched to ~UnifedMap/Set/~FastList
* Use ~UnifiedMap instead of ~THashMap in generated Finder
* Use Caramel ~ListFactory and ~MapFactory instead of Collections
* Use ~CaramelList.sort instead of Collections.sort
* ~MithraList now implements ~CaramelIterable and asCaramelList()
* artf308502 added Attribute.getMetaData(). notable methods are isNullable and getProperty. Attribute.getMetaData().getAttributeName now works for mapped (navigated) attributes
* artf27255 misc: minor stlylistic code cleanup
* artf27255 misc: better error message
* artf301837 add version checking to mithra jar

## Bug Fixes

* artf301277 ~BiTemporalDirector inactiveObject to include CBD
* artf308608 fix complex operation produces bad sql
* artf283339 fixed Sybase IQ repeat read error during bulk insert
* artf309365 fix multiple in-clause with source in-clause

# ## Mithra Releases 9 Through 10

# 10.15.2 (02/04/2010)

This release includes just one important bug fix that affects Mithra 10.13.0-10.15.1. Please upgrade to 10.15.2 if you're using the affected releases.

## Bug Fixes

* artf308146 fix Mithra QueryIndex NPE


# 10.15.1 (01/18/2010)

## Enhancements

* artf68658 deep fetch consistency: implemented adhoc list deep fetch
* artf283339 Sybase IQ bulk load binary formats for bit accuracy
* artf298789 add substring to StringAttribute
* artf27255 misc: better thread name for the reference thread
* artf296516 Add support for attribute.in(*Iterable*, Extractor)

## Bug Fixes

* artf27255 misc: fixed query cache defaulting for transactional dated objects
* artf300180 fixed in-memory group by on a to-many relationship causing a ClassCastException. Added bypassCache to AggregateList.


# 10.15.0 (12/21/2009)
## Note: version number jump is due to move to Hikari

## Enhancements

* artf283339 improved Sybase IQ bulk load with quotes in strings, doubles, floats, nullable chars
* artf293816 ThreadConservingExecutor can be fifo or priority queued

## Bug Fixes

* artf27255 fix purge of outz'ed rows with overlapping business dates
* artf27255 Immediately return the result of None operation
* artf27255 fix issue with detached deleteAll


# 10.13.0 (12/15/2009)


## Enhancements

* artf283339 Implemented Sybase IQ bulk update
* artf283339 Implemented Sybase IQ unique index violation detection
* artf293011 Implemented serialization for in-memory and detached objects with relationships
* artf27255 Make operation based lists serializable
* artf68658 More prelimnary work for deep fetch consistency
* artf27255 Log identity getter statement and use fully qualified table name
* artf27255 misc: pickup the relationshipCacheTimeToLive from ~MithraRuntime tag


## Bug Fixes

* artf27255 Fixed refresh of dated objects for future dates
* artf27255 Fixed purge of outz'ed rows with overlapping business dates
* artf291510 Fixed problem with NOT IN operation when an empty set is passed.
* artf290917 Reduced memory usage (forEachWithCursor/dated, ~CachedQuery, complex relationships)
* artf27255 Ensure a deep fetch through a none cached class causes reload for all children
* artf47103 Temporary objects no longer send/receive notification messages


# 10.12.0 (11/18/2009)


## Enhancements

* artf281276 Ensure portal is fully initialized before use
* artf27255 Detect nested db2 deadlock exceptions better
* artf283157 Added retry on timeout to single queue executor
* artf283157 Added retry on timeout to single queue executor
* artf283339 Implemented Sybase IQ bulk loader and set up test suite for Sybase IQ
* artf283632 Improved forceRefresh of adhoc list in a transaction
* artf27255 Make sure updates do not exceed batch size in ~SingleQueueExecutor
* artf27255 Make sure indices are repopulated if an object was taken from weak backing
* artf27255 Ddl generator: prefix foreign key name with table name
* artf82213 Updated db2 drivers
* artf153419 Added support for ~BigDecimal datatype.


## Bug Fixes
* artf27255 Fixed a possible NPE when handling a transaction exception
* artf284304 Fixed single simulated sequence with multiple source attributes
* artf284990 Fixed isModifiedSinceDetachement(Extractor) throws NPE for in memory objects
* artf283211 Fixed NPE when inserting and simultaneous finding


# 10.11.0 (10/22/2009)

## Important Note:
Mithra 10.11 and higher require create table permissions in Sybase's tempdb and DB2's SESSION Schema. Temp tables
are used for more efficient read queries. For DB2: one needs to grant creattab on database to dact_rw group; createin,alterin,dropin schema permissions on SESSION schema to dact_rw group; and use of user tablespace(s) to dact_rw group. These set of permissions are fully compliant with DACT guidelines.


## Enhancements

* artf83394 Improved large in-clause support in or-clause, exists-clause, aggregate queries, and mutliple large in-clauses
* artf276769 Updated H2 to 1.1.118
* artf276769 Updated to trove-2.0.4.1, log4j-1.2.15, and jndijdbc-2.2.0.1 libraries.
* artf276769 Updated Sybase jdbc driver (jconn3-6.0.5-EBF16903)
* artf27255 Immediately return the result of None operation
* artf27255 Try getting the configuration from multiple class loaders
* artf27255 Minor logging improvement for closed connections.
* artf274050 Make operation combining independent of configuration


## Bug Fixes
* artf274533 Fixed bypassCache for deep fetched relationships
* artf27255 Fixed NPE when sorting via a related object's attribute for a non-existant relationship
* artf27255 Fixed potential concurrency issue when initializing simulated sequence during code generation.


# 10.10.0 (10/05/2009)


## Enhancements

* artf47103 Temporary object context initial implementation
* artf27252 Enhanced ~MithraTestResource documentation.
* artf263271 Added constant arithmetic operations to Integer and double
* artf265419 Added getNonPersistentCopy() support
* artf266650 Added loadOperationProvider to runtime xml
* artf27255 misc: show newly initialized classes in Mithra Cache UI
* artf68658 Refactored some code to start adding deep fetch to adhoc list
* artf6984 Added support for HAVING clause to Mithra ~AggregateList.


## Bug Fixes

* artf261560 Exception being created but not thrown


# 10.9.0 (08/28/2009)

## Enhancements

* artf27255 misc: hostname/port for sybase is now detected with both v2 and v3 drivers
* artf252949 Changed All operation serialization so it can work without object configuration
* artf27255 misc: ~MithraTestResource.insertTestData now clears the query cache
* artf27255 misc: make sure operation based lists cannot be modified
* artf47103 Temporary object context initial implementation.
* artf27255 misc: Various code cleanups, fixed typos, improved log messages.
* artf27255 Ensure operation based lists cannot be modified



## Bug Fixes

* artf239702 Fixed updating table-per-class inheritance without a transaction
* artf27255 Fixed bad simulated sequence initialization when using table-per-class inheritance.
* artf253382 Fixed various issues with Mithra Aggregation.



# 10.8.0 (08/04/2009)


## Enhancements

* artf237174 Added flag to generate read only interfaces
* artf27255 Mark transaction timed out if it happens just before commit
* artf237714 Allow multiple life cycle parents for many-to-many objects
* artf238039  ~AbstractOperationBasedList.resolveOperationInMemory to handle bypassCache correctly
* artf236695 Improved batching combination performance

## Bug Fixes

* artf27255 Ensure ~BatchUpdateOperation is combined with other ~BatchUpdateOperations
* artf236918 Fixed multi-equality operation when the same attribute appears multple times
* artf27255 Fixed duplicate generated method when using table-per-class inheritance model with a simulated sequence pk strategy.



# 10.7.0 (07/27/2009)


## Enhancements


* artf27255 misc: shutdown the generator threads as early as possible
* artf232862 add generics to Attributes and Finders
* artf233875 add support for interface generation to superclasses

## Bug Fixes

* artf41968 Ensuring that relationships are inhereted correctly when using table-per-class inheritance.
* artf27255  Ensuring that reverse relationships are handled correctly when using table-per-class inheritance.
* artf27255  Fixed bad generated code when using non-generated superclasses and Mithra interfaces.
* artf209753 Fixed default values for complex operations not being inserted


# 10.6.1(07/10/2009)

## Enhancements

* artf227358 Added getAttributeAsObject to ~AggregateData and getAttributeAsSet to ~AggregateList

## Bug Fixes

* artf27255 forEachWithCursor now honors the bypassCache flag
* artf27255 Calling clearQueryCache after mithraTestResource.insertData
* artf27255 Mithra was producing wrong SQL when creating aggregate queries grouping by a related attribute.
* artf27255 Fixed warnAboutConcreteClasses for the generator task
* artf40867 Updated document to include a section on transaction management
* artf27255 Fixed rare class initialization problem.


# 10.6.0 (06/25/2009)

## Enhancements

* artf21608 Started the implementation of a faster Mithra test resource (not finished)
* artf27255 misc: Improved performance of detached copyDetachedValues  with optimistic locking.
* artf27255 misc: Added eq(long) to integer attribute
* artf27255 misc: re-added overloaded method for better backward compatibility

## Bug Fixes

* artf224338 Fixed problem with OR operations with dated objects missing default asOf operations.
* artf224639 Fixed In operation could return incorrect result in a transaction
* artf226533 Fixed isDeletedOrMarkForDeletion throws NPE in a transaction with dated objects
* artf27255 Ensure queries involving temporary objects are removed from cache after destroying context.
* artf227030 Disable query cache for temp objects
* artf227031 Fixed transactional participation of dated objects with copyNonPrimaryKeyValuesFrom without a change


# 10.5.0 (06/04/2009)

## Enhancements

* artf219081 Added support for parallel queries.
* artf27255 Made a couple of fields volatile in ~MithraTransactionalObjectImpl to ensure proper multi-threaded coordination.


# 10.4.0 (05/15/2009)

## Enhancements

* artf27255 Make nonPrimitiveEq more generic

## Bug Fixes 	

* artf212100 Fixed forEachWithCursor causes ~StackOverflow with very large in clause.
* artf212480 Ensuring Sybase temp tables are dropped after transaction
* artf27255 Ensure single queue executor bulk insert is set for dated updates as well.
* artf47103 Make sure destroying temp context with source cleans up properly
* artf214620 Non dated detached objects now check optimistic attribute when re-attaching


# 10.3.0 (04/28/2009)

## Enhancements

* artf201892 Replaced attr.eq(otherAttr) with attr.joinEq and attr.filterEq
* artf27255 Added a clear() method to ~PerfromanceDataPerOperation
* artf32017 Added an ability to have hard references between related objects
* artf27255 Improved the way dead connections are detected

Bug Fixes 	

* artf27255 Fixed filter expressions for non-primitive attributes in relationships
* artf209753 Fixed default values for as of attributes not always used
* artf27255 Fixed temp context created mutliple times in a transaction with source attribute
* artf27255 Fixed a potential concurrency issue with initialization in multiple threads
* artf163555 Ensure cache is cleaned up properly when using deleteAllInBatches().
* artf211053 Aggregate queries with no GROUP BY return correct default values
 



# 10.2.1 (04/22/2009)

## Bug Fixes

* Fixed bad SQL generation when having an Operation with mixed exists clauses or exists clause after another exists clause.


# 10.2.0 (03/23/2009) 


## Bug Fixes 	

* Fixed ~ClassCastException when the equality operation among an ~AsOfattribute and a ~TimestampAttribute results in a ~NoOperation
* Fixed race condition when creating temporary object contexts
* artf200104 Fixed bad code in a non-dated to dated relationship
* artf27255 Fixed accessing uninitialized dated object


## Enhancements

* Improved error message string
* artf163555 Ensure that transaction failures are handled properly when deleting Mithra lists in batches.
* artf82213 Upgrading H2 to version 1.1.108
* artf27255 Refactored ~SingleQueueExecutor to make it easier to extend its functionality.
* artf199103 Consolidated nested exists clauses
* artf200674 Implemented setAsString for date and timestamp columns as workaround for Sybase
* artf27255 Implemented notification handler for purge operations.

# 10.1.0 (03/06/2009)

## Bug Fixes 	

* Fixed trim for dated object string attributes
* Fixed bypass cache when simplified in-clause is used
* Fixed exists with non-dated to dated relationship
* Ensuring that deleteAllInBatches works with a Mithra operation that Mithra will break in multiple database operations
* Fixed issue in ~MithraTestResource when loading bcp files with null fields in the beginning or end of the record.
* Combine operations better for batching. Fixed bug when trying to combine a mass delete (delete using operation) with regular Mithra operations.


## Enhancements

* Implemented many-to-many deep fetch
* Implemented null check for uninitialized pool 
* Added a null check to lower case calculator
* Implemented tcp based notification





# 10.0.2 (02/03/2008)

## Bug Fixes 	

* Improved batching combination performance
* Ensuring related objects are also set to detached after copyDetached
* Fixed bad List index when calling deleteAllInBatches().



# 10.0.1 (01/27/2009)

## Bug Fixes 	

* Improved batching combination performance 

# 10.0.0 (01/27/2009)

## Enhancements

* Improved batching combination performance
* Read locked objects can be shared in multiple transactions.
* Changed the behavior of copyDetachedValuesToOriginalOrInsertIfNew to always go into a detached state
* Improved batching combination performance
* Use thread pool for executeTransactionInSeparateThread and elsewhere
* Changed the behavior of copyDetachedValuesToOriginalOrInsertIfNew to always go into a detached state
* Make ~MithraTimestamp also uncorruptable
* Speed up multi-in with partial index matches
* Implemented dated non-unique index
* Dependent to-one relationships for in-memory objects do not go to the database
* Fixed not-equals in a relationship via an intermediate table
* Modified object constructors will no longer cause a NPE in a transaction
* Allow primitives to be initialized to null
* Added a flag to the generator to ignorePackageNamingConvention
* Re-organized the release files.
* Added IntelliJ/Eclipse templates to ease the creation of Mithra xml files (~MithraObject, ~MithraRuntime, Mithra Class list)


## Bug Fixes 	

* Fixed rare case where repeated operation makes And operation have the same hashcode
* Fixed processingDate.~EqualsEdgePoint returns wrong results in a transaction
* Fixed dated index lookup
* Fixed the way Mithra report warnings/errors after bad inserts.


# 9.6.1 (12/04/2008)

## Bug Fixes 	

* Fixed deep fetching with null values
* Avoid setting thru_z if the date is in the future
* Mark the as of attributes as transient to serialize properly


# 9.6.0 (11/20/2008) 


## Enhancements
* Improved read write lock performance
* Improved performance of  ~SolidString indexing
* Improved dated object relationship lookup
* Reduced lock overhead for dated objects database reads
* Make inherited source attribute checking less strict
* Reduced memory usage during deep fetch
* Support null for read-only infinity (and write)
* Upgraded third party libraries: Trove 2.0.4 and Joda-Time 1.6.0.


## Bug Fixes 	

* Fixed incrementUntil followed by set generates incorrect sql
* Fixed re-loading full cached read only objects with indices
* Fixed race condition in test case
* Fixed ~DoubleAttribute.increment for dated objects
* Fixed serialization of nano seconds
* Fixed double termination of audit only object
* Fixed database to xml generation
* Fixed bad code generation when using inheritance and dependent relationships.

# 9.5.0 (10/29/2008)

## Enhancements
* Reduced the generated code in the abstract List class
* Reduced generated code in the finder subclasses
* Moved createTestTable and verifyTable to abstract class
* Added a shutdown method to ~MithraMultiThreadedQueueLoader
* Added support to perform deleteAll in batches.
* Improved non-dated to dated relationship lookup
* Stopped using removed FWCommon methods
* New version of Joda Time library.


## Bug Fixes 	

* Fixed remove on Live object does not cascade
* Fixed non-exists in a dated context with default date
* Fixed relationship appearing in two or-clauses creates bad sql
* Propagate a mutable primary key to children and delete in the right order


# 9.4.2 (10/10/2008)

## Bug Fixes 	

* Fixed a concurrency issue in the generator (~FileNotFoundException)
* Added the method reachedMaxObjectsToRetrieve back to ~MithraList interface
* Fixed remove on Live object does not cascade.


# 9.4.1 (10/06/2008)

## Enhancements

* Make ~MithraTestResource nestable

## Bug Fixes 	

* cacheTimeToLive is not passed to query cache
* Fixed read-only index iterator



# 9.4.0 (09/29/2008)


## Enhancements

* Separated out the archive writer
* Reduced generated code
* More robust teardown for unit tests
* Optimized read only non-unique index
* Reduced generated code in the finder

## Bug Fixes 	

* Fixed ignoreNonGeneratedConcreteClasses



# 9.3.0 (09/08/2008)


## Enhancements

* Exposed ~MithraRunTime for transformation
* UI no longer tries to initialize all objects

* Added support for loadCacheOnStartup
* Added buffering to serial streams
* Performance improvement for full cache load
* Reduced solid string reallocations
* Added a memory barrier to the queue loader
* Ensure generated code is the same every time
* Multi-thread the generator

## Bug Fixes 	

* Fixed reading read-only archive
* Ignore spurious interrupted exception
* Use Joda in ~ImmutableTimestamp to avoid multi-threading issues
* Fixed toString on ~ImmutableTimestamp


# 9.2.3 (08/28/2008)

## Bug Fixes 	

* Fixed serialization problems of Mithra objects that use inheritance.


# 9.2.2 (08/21/2008)


## Enhancements

* Make Notifications messages more resilient.



# 9.2.1 (08/13/2008) 

## Enhancements

* Optimized read-only object loading
* Make notification messages more resilient
* Updated h2, docbook, ant libraries
* Removed dependency on concurrent jar
* Improved performance of filtered mapper
* Reduced memory usage of ~NonUniqueIndex
* Generated code cleanup

## Bug Fixes 	

* Fixed clearQueryCache on temporary objects.
* Fixed bad code generation for int identity.
* Fixed potential NPE when serializing Mithra objects.
* Fixed temp table creation for Sybase in transactions
* Prevent refreshing dated in memory objects.
* Inserting test data programatically does not work with objects with source attribute.
* Fixed bad code generated when using identity attributes.
* Fixed initialization of temporary objects.
* Fixed DDL generation for relationship between dated and non-dated objects
* Timestamp pooling: ensure serialization is backwards compatible.
* Fixed  applyOneByOne in ~MappedOperation
* Timestamp pooling: proper inheritance for as of attributes
* Fixed exception thrown during Mithra XML generation.

# 9.1.0 (07/13/2008)

## Enhancements

* Enhanced ~MithraGenerator error reporting.
* Implemented Cache Archiving
* Removed unnecessary generation message
* Implemented Timestamp pooling
* Implemented ~SolidString
* Cleaned up ~MithraGenerator classpath
* Implemented foreign keys with relatedIsDependent


## Bug Fixes 	

* Fixed code generation from non-dated-read only object to dated object relationship
* Fixed cascadeInsert so it's retriable


# 9.0.1 (06/18/2008)

## Bug Fixes 	

* artf131207 Fixed wrong status sent by ~MithraTransaction to its registered Synchronizations after transaction is completed.


# 9.0.0 (06/17/2008)

## Enhancements

* artf27255 Added  a couple of test cases for none caching
* artf41813 Added factory parameter in config file for pure objects
* artf124196 Added beginBatch, endBatch to GSI plugin
* artf27255 Removed calls to Math.ceil/floor
* artf27255 Improved unit test output
* artf126530 connectionManager.setSchema work for DB2
* artf47103 Started implementation of user defined temp objects
* artf27255 Added failing test case for SYBIMAGE bulk insert
* artf27255 Updated unit test library
* artf47103 Added existsWithJoin to temp object finder
* artf129085 Removed dependency on jasper from Mithra class generation.
* artf129091 Removed echo2 based Mithra Cache UI
* artf47103 Implemented retry table creation for temp objects
* artf27255 Better format for mithra version in notification message
* artf27255 Allow programmatic setup of test data using ~MithraTestResource.



## Bug Fixes 	

* artf123161 Fixed cascadeDelete throws ~StackOverFlow on self relationships
* artf128649 Fixed relationship with link table with more than 2 attributes generates bad sql
* artf124629 Fixed ddl creation is missing foreign keys columns


# ## Mithra Releases 1 Through 8

# 8.9.1 (05/12/2008)


## Enhancements

* artf118629 Implemented order by for calculated string attribute.
* artf27255 Enabled extensibility of replication notification manager.
* artf27255 Improved error message for test resource


## Bug Fixes 	

* artf118406 Fixed failed insert causes cache corruption
* artf27255 Updated to jtds-jbcp 1.2.0.10 to fix numeric rounding error
* artf118976 Fixed missing imports when having relationships with/from classes with generated interfaces. 



# 8.9.0 (04/29/2008)


## Enhancements

* artf27255 More compact and readable error reporting 
* artf27255 Added test for special characters for Sybase insert
* artf115052 Allow inactive data to participate in a transaction
* artf112639 Eliminated cyclic dependencies among Mithra finders.
* artf113812 Upgraded tomcat components - jasper, jsp-api, servlet-api used for Mithra class generation.

## Bug Fixes 	

* artf108088 Fixed issues with deep fetching and bypass cache not using in-clause
* artf112415 Fixed lazy initialization during a transaction.
* artf112502 Fixed forEachWithCursor eats exceptions on ~ResultSet.close
* artf32756 Fixed test data parsing problem in ~MithraTestReosurce. Parsing bcp files with nulls was causing the process to fail.
* artf114508 Fixed detached delete of mutable primary keys
* artf114568 Fixed sql generation with multiple exists clauses and dated objects


# 8.8.0 (04/07/2008) 


## Enhancements

* artf103270 Implemented Partial cache timed expiration
* artf6985 Basic identity support
* artf27255 misc: wait for the right transaction with dated objects
* artf107869 Delayed class instantiation during unit tests
* artf108086 Improved concurrency of dated objects
* artf27255 Improved error reporting for update failures.
* artf27255 Improved insert SQE performance by delaying the batching when queue is full


## Bug Fixes 	

* artf108088 Fixed issues with deep fetching and none cache setting
* artf103400 Fixed ~CacheType none does not hit the database on relationship deep fetch
* artf94281 Fixed missing method generation in the generated code
* artf104814 Fixed Rollback dies with an exception
* artf104723 Deleted objects are no longer stuck in the cache when clearCache is called asynchronously






# 8.7.1 (03/26/2008)

## Bug Fixes 	

* artf27255 Fixed servlet mapping for ~MithraCacheUiServlet.
* artf27255 Added default web.xml for Mithra control panel.
* artf6936 Enhanced control panel: moved servlet to proper path
* artf27255 Added missing Serializable interface to dated objects
* artf27255 Added missing thridparty libraries.
* artf27255 More lenient unit test setup. Insert test data as long as the database object is valid and it is in use for the test case.
 



# 8.7.0 (03/25/2008)

## Enhancements

*artf27255 More lenient unit tes setup, won't insert unconfigured objects
*artf6936 Enhanced middle tier cache control panel
*artf100505 Allow non-locking reads of business date only objects - use with care
*artf27255 Upgrading PCJ library to version 1.2a. This version contains a fix to bad hashing algorithm.



## Bug Fixes 	

* artf27255 Fixed NPE in test setup
* artf27255  Fix problem with nullBits logic whit more than 31 nullables fileds.



# 8.6.0 (03/10/2008)

## Enhancements

* artf27255 Small enhancement to ~SingleQueueExecutor
* artf27255 Removed jalopy, as it no longer provides any value.
* artf27255 Improved performance of full unique index by 10%

## Bug Fixes 	

* artf94139 Fixed problem in Mithra Generator when primitive mutable PK are used.


# 8.5.0 (02/26/2008)

## Enhancements

* artf94281 Cleaned up generated code, refactored classes to eliminate duplication. Reduced amount of generated code.
* artf27255 misc: sanity check when constructing an object

## Bug Fixes 	

* artf93448 Fixed deep fetch does not simplify to in-clause under some conditions
* artf94139 Fixed problem with bad code generation for objects with mutable primary keys.
* artf94877 Fix bad casting in generated code due to interface generation.



# 8.4.0 (02/18/2008)


## Enhancements

* artf27255 misc: performance improvement for to-one relationships
* artf91408 Enabled inplace update in mithra
* artf91622 Add Properties to mithra Attribute

## Bug Fixes 	

* artf27255 misc: break up in clause takes into account distinct
* artf27255 Added a retriable condition for jtds when DB closes connection
* artf71800 Rescue objects from abandoned transactions




# 8.3.0 (02/06/2008)


## Enhancements

* artf32758 Making arithmetic operations work in search
* artf87354 Upgrade to latest common Finder protocol (0.8.0)
* artf75458 Improved startup time by lazy initialization
* artf27255 Break up in clause better
* artf89844 Support import elements in mithraobject.xsd
* artf90028 Added edgePoint and executeBufferedTransactions info to FAQ

## Bug Fixes 	

* artf87690 Fixed deleteAll with large in clause generates bad parameters


# 8.2.1 (01/17/2008)

## Bug Fixes 	

* artf82812] Support identity bulk insert for Sybase
* artf27255] Proper timezone conversion when setAsString is set to true
* artf85508] Fixed an unexpected rollback does not call synchronizations
* artf6948 ] Support for aggregation of character attributes.
* artf85596] Improved detached objects and optimistic locking
* artf85597] Fixed bug to allow ~AsOfAttribute override.



# 8.2.0 (01/15/2008)

## Enhancements

* artf27255 Break up IN clause better for Sybase during updates
* artf82812 Support identity bulk insert for sybase
* artf6965 Implemented mod function
* artf83667 Enhanced template for key generation and finder superclasses


Bug Fixes 	

* artf27255 Fixed problem when aggregating absolute values.


# 8.1.0 (01/05/2008)

## Enhancements

* artf75738 First attempt to implement generic Finder protocol.
* artf47103 Preliminary work for temporary table use
* artf80320 Improved deepfetch of to-one relationships
* artf80958 Upgraded to jtdsjbcp-1.2.0.9 to fix string truncation issue
* artf81045 until operation support
* artf27255 Moved generated code to abstract class
* artf82213 Upgraded to Trove 2.0
* artf27255 Break up in clause better for Sybase during updates
* artf6980 Generate Interfaces for Mithra Objects


## Bug Fixes 	

* artf27255 Synchronized call to avoid multi-threading problem
* artf77839 Ensuring that mutable primary keys components are considered when determining if a detach object has changed since its detachment.


# 8.0.0 (12/08/2007)

## Enhancements

* artf75458 Improve startup time by lazy initialization
* artf41813 pure objects in 3 tier mode
* artf27255 Better error messages for notifications.


## Bug Fixes 	

* artf77075 Ensuring that dependent operations in transactions are flushed properly.

# 7.9.0 (11/28/2007)

## Enhancements

* Implemented inactiveForArchive with business date settable
* Better teardown in notification tests
* Rescue objects from abandoned transactions
* Pure objects bypass cache works now
* Implemented late deep fetch
* Implemented Transaction Local Storage
* Avoid reparsing the same file for test cases
* Tests and bug fixes for Pure Objects.
* Added Mithra version number to generated files

## Bug Fixes 	

* Dont start listening for messages until handler is ready
* Fixed unreliable test
* Fixed rare timing issue


# 7.8.0 (11/14/2007)

## Enhancements

* artf27255 Better waiting for notification messages in test cases
* artf70772 Enabled non dated mithra objects in ~SingleQueueExecutor
* artf6962 Implemented polymorphic EVOs.

## Bug Fixes 	

* artf71253 Fixed multi-threading issue using order by on related attribute


# 7.7.0 (11/09/2007)

## Enhancements

* artf6962  Added hierarchy of abstract extractors.
* artf27255 Tuned flushing of the pending operations.
* artf27255 Test are more parallelizable to reduce build time
* artf69226 Make exception serialization immune to bad causes
* artf64010 Archival: allow purging for old dates.
* artf27255 Upgraded Sybase driver to JConnect2 5.5 EBF 13904


Bug Fixes 	

* artf69687 Fixed byte array primary keys cause problems with multi-update
* artf64009 inactiveForArchive: set the time as passed in, not current

# 7.6.0 (11/02/2007)

## Enhancements

* artf67112 Removed dependency on commons collections.
* artf27255 Upgraded H2 to version 1.0-2007-10-20.
* artf68543 Created ~DbExtractor
* artf64009 Implemented inactiveForArchive and terminateUntil

## Bug Fixes 	

* artf68672 Fixed problem when re-attaching detached objects with deep dependent relationships.
* artf68674 Fixed 3-tier terminated object causes NPE


# 7.5.0 (10/25/2007)

## Bug Fixes 	

* artf66904 Fixed problem with non-dated objects created outside of transaction and optimistic locking.
* artf27255 Allow not equals in constant expressions for relationships
* artf67046 Avoid generating setUntil methods for From and To attributes.
* artf67051 Fixed problem with None operation and dated objects when cache is being bypassed


# 7.4.2 (10/22/2007)

## Bug Fixes 	

* artf66297 Fixed exception in when deep fetching.
* artf27255 Cleaning up resources during tearDown in ~MithraTestResource.


# 7.4.1 (10/16/2007)

## Enhancements
* artf63821 Retry on schema change exception.
* artf36075 Report primary keys on duplicate insert.

## Bug Fixes 	

* artf54591 Fixed possible issues with 3-tier optimistic locking.



# 7.4.0 (10/08/2007)

## Bug Fixes 	

* artf63636 Added ~TimeZone conversion for aggregate data
* artf54591 Fixed possible issues with 3-tier optimistic locking


# 7.3.2 (09/18/2007)


## Bug Fixes 	

* artf27255 Fixed possible NPE
* artf27255 Fixed business date timezone conversion



# 7.3.1 (09/16/2007)

## Enhancements

* artf27255 Better error reporting

## Bug Fixes 	

* artf27255 Allow setting boolean an integer attributes on datasource
* artf51368 Disabled between clause for DB2 in conjunction with large in clauses
* artf27255 Fixed timezone insensitive serialization on ~MithraTimestamp



# 7.3.0 (09/06/2007)

## Enhancements

* artf46042 Added ability to clone task to ~SingleQueueExecutor callable
* artf27255 Reduced size of generated code
* artf47855 Implemented auto updating timestamp column
* artf47832 Improved connection manager: connections with thread affinity and eviction
* artf50346 Reduced serialization overhead and avoid version mismatch
* artf27878 Retry on timeout
* artf46042 Custom error handler for ~SingleQueueExecutor


## Bug Fixes 	

* artf27255 Fixed  Sybase top query with cursors
* artf50077 Fixed problem with more than 32 nullable fields
* artf50085 Fixed NPE when dependent object is null
* artf27255 Fixed threading issues due to usage of ~SimpleDateFormat in SQL log helper classes.
* artf50106 Fixed bad SQL with repeated in clause
* artf50199 Fixed problem in ~DatedTransactionalCache
* artf50543 Fixed Query cache not used properly in a transaction for read only objects








# 7.2.0 (08/21/2007)

## Enhancements

* artf46042 custom error handler for ~SingleQueueExecutor
* artf27255 Make max simplified in clause for deep fetch settable
* artf27255 Make sure we load the proper libraries on windows for RV 7
* artf27255 Use more appropriate flag on rollback
* artf27255 Fully qualify sys table names
* artf27255 Better camel case when converting db column names
* artf47719 Mechanism for transactional updates in SQE
* artf41816 Allow mutable primary keys
* artf27255 Better logging and more explicit table creation for bcp
* artf27255 Included mithraobject.xsd in Mithra release.
* artf27255 Upgraded FWCommon to version 10.1.0.


## Bug Fixes 	

* artf47503 Fixed clear cache causing issues with dated objects enrolled in transactions



# 7.1.0 (07/31/2007)

## Enhancements

* artf43550 Combine operations better for batching
* artf45364 Implemented methods to check persistent state of Transactional Mithra Objects.

## Bug Fixes 	

* artf41396 Better retires for deadlocks in ~SingleQueueExecutor - fixed missed retry


# 7.0.0 (07/23/2007)

## Enhancements

* artf43552 Hold deep fetched references in original list to prevent garbage collection of related objects
* artf43550 Combine operations better for batching
* artf27255 As of attributes columns are not copied from detached object to original
* artf27255 Various code cleanups.
* artf27252,artf8695 Converted Primary Key Generator document to ~DocBook
* artf32756,artf32755  ~MithraTestResource enhancements.

## Bug Fixes 	

* artf43713 Fixed Sybase bcp with wide tables could insert corrupt data
* artf43940 Fixed NPE when a relationship has a null value as a foreign key
* artf44237 Fixed problem when using ~AsOfAttributes in OR operations.

# 6.5.0 (07/16/2007)

## Enhancements

* artf27255: Upgraded docbook and fop.
* artf27255: Added Testing Philosophy document
* artf27255: Converted FAQ to docbook
* artf43076: Allow objects that have multiple life cycle parents
* artf43077: Allow non-transactional thread to read object
* artf27255: Better login failure error message

## Bug Fixes 	

* artf42343: Fixed bug with or-clause and dated relationships.


# 6.4.2 (07/03/2007)

## Enhancements

* artf40971: allow removal of objects from the cache via a filter
* artf41396: Better retries for deadlocks in ~SingleQueueExecutor

## Bug Fixes 	

* artf7302: Fixed rare issue with in memory resolution of non-dated to dated object


# 6.4.1 (6/25/2007)

## Enhancements

* artf27255 : Better error message for duplicate primary key on refresh
* artf27255 : Faster hashing and equals for ~MapperStack
* artf40546 : Full support for future dated queries
* artf40559 : Detect db2 dead connections better

## Bug Fixes 	

* artf39495 : incrementUntil and insertWithIncrementUntil now can do in place update when appropriate - processing date is now updated.


# 6.4.0 (06/17/2007)

## Enhancements

* artf27255 : Relationships between non-dated to dated object now can use using ~AsOfAttribute in relationship expression.
* artf27255 : Better error message when transaction fails
* artf27255 : Better waiting for in-flight transactions
* artf39495 : incrementUntil and insertWithIncrementUntil now can do in place update when appropriate
* artf27255 : Added method to compare non-primary key attributes with a tolerance for floating point attributes.
* artf27255 :  Cleaning up ~MithraManager properly after every test case.
* artf38869 : Added methods for detecting changes to detached relationships
* artf39872 : Add method to get Relationship and dependent Relationship finders.

## Bug Fixes 	

* artf38108 : detect dead connections and reset them


# 6.3.5 (06/05/2007)

## Bug Fixes	

* artf37498 : Reduce deep fetch memory requirements for relationships with constant in clauses.
* artf27255 : Fixed not exists when traversing multiple relationships.
* artf38108 : Detect dead connections and reset them.
* artf27255 : Fixed problem with relationship between non-dated to dated object using ~AsOfAttribute in relationship expression.


# 6.3.4 (05/30/2007)
## Enhancements and New Features

* artf37326 : Add more diagnostic messages for notification failures.

## Bug Fixes 	

* artf27255 : Temp table is dropped when retrying due to deadlock
* artf37498 : Reduced deep fetch memory requirements for relationships with constant in clauses


# 6.3.3 (05/28/2007)
## Enhancements and New Features

* artf37276 : Differentiate between the processing and real start times of a transaction

## Bug Fixes 	

* artf27255 : Temp table name for bcp is made absolutely unique.
* artf37326 : Add more diagnostic messages for notification failures.


# 6.3.2 (05/24/2007)

## Enhancements and New Features

* artf36955 : Support in and notIn operations for byte array attributes
* artf27255 :  More concise error reporting when not in debug mode


## Bug Fixes 	

* artf36899 : Fixed bad method signature in ~ByteArrayAttribute.

# 6.3.1 (05/17/2007)


## Enhancements and New Features
* artf27255 Added infinity timestamp for 06/06/2079 11:59:00.0 PM.
* artf27255 Added weakly-typed version of copyNonPrimaryKeyAttributesUntilFrom to ~MithraDatedTransactionalObject interface.
* artf36247 allow byte arrays for primary key and relationships
* artf36241 is null operations can now use indices

## Bug Fixes	

* artf36045 fixed valueOf in Long and calculated attributes to properly deal with null
* artf27255 misc fix: make sure single queue executor works without bulk insert
* artf27255 misc fix: fix typo in method name
* artf36100 Fixed various bugs in ~MithraObjectXmlGenerator. Various refactoring. Using proper logger for debug and error messages.
* artf27255 misc fix: retry on temp table creation for bcp
* artf27255 misc fix: allow non-transactional use of dated object that is not inserted yet
* artf27255 misc fix: generate proper code for primary key lookup in a relationship
* artf27255 misc fix: correctly convert timezone for as of attributes
* artf36339  Fixed problem with abstract superclasses without PK.
* artf36338,artf36335 : Ensure that generated primary key is correctly propagated to children in a dependent relationship. Ensure that for dependent relationship of dated to not dated we are generating code correctly.


# 6.3.0 (05/14/2007)

## Enhancements and New Features
* artf33017 : Improved runtime configurability.
* artf32866 : Added tolerance for float/double comparisons in nonPrimaryKeyAttributesChanged().
* artf7282 : implemented not exists
* artf7286,artf7285 : Implemented top query for Sybase and DB2

## Bug Fixes	
* artf33720, artf34089, artf34609 : Various bug fixes to JTDS JBCP driver and additional test cases.
* artf35073 : Fixed Mithra Generator bug with inheritance in different packages.


# 6.2.1 (04/24/2007)


## Enhancements and New Features
* artf32425 : make sure date and timestamp operations are serialized properly with timezone conversion rules
* artf32649 : Reduced the amount of debug statements on the console when running test cases in debug mode.
* artf6974 : better use of query cache for to-one relationships
* artf6948 : Improved serialization of aggregate calculators.
* artf32757,artf32756 : Enhancements to ~MithraTestResource for Sybase test cases.

## Bug Fixes	

* artf29957 : move bulk insert decision to database object
* artf32982 : Fixed problem with tab characters in Relationship tag.
* artf27255 : make sure we use server side order by when there is a limit on number of rows.
* artf6948 : Fixed problem in Aggregation without grouping. Fixed problem with multiple aggregate attributes and/or group by attributes with the same name.

# 6.2.0 (04/18/2007)

## Enhancements and New Features
*	artf6960 : Third type of inheritance support
*	artf32333 : Generification of ~DelegatingList retainAll, ~ContainsAll, and removeAll methods
*	artf6948 : Group by functionality for serve side aggregate queires.

## Bug Fixes 	

*	artf30892 : Fix setting relationship before any attribute
*	artf32424 : Insert followed by terminate will now issue a delete
*	artf32422 : Use Set instead of ~HashSet for deepFetchedRelationship

# 6.1.0 (03/27/2007)

## Enhancements and New Features
*	better logging in case of duplicates in findOne
*	enable validating xml files for domain xml
*	optimistic locking for non-dated objects
*	improve deep fetch to avoid joins more frequently
*	artf29955: avoid sending order by to the database and sort after loading. This avoid temporary table
*	artf7391: large in clause support
## Bug Fixes
*	artf29430 : fixed bug with non-mithra reinsertion causing an exception
*	Fixed dependency on fwbase when using ~MithraDbDefinitionGenerator


# 6.0.2 (03/13/2007)

## Enhancements and New Features
*	Added documentation for Mithra Visualization
## Bug Fixes
*	Fixed as of operations with filtered mapper and distinct

# 6.0.1 (03/07/2007)

## Bug Fixes
*	artf27876: Temporary fix for reading Sybase timestamps from different regions for illegal dates 

# 6.0.0 (02/11/2007)

## Enhancements and New Features
*	implemented exists instead of distinct and join
*	added useMultiUpdate support to disable multi-update in the runtime configuration 
*	Do not allow setAttribute for persisted, read-only objects
*	Read only objects implement serializable
*	better log message in ~MithraManager more diagnostic output for Sybase bcp 
*	upgraded H2 
*	removed hard coded values from ~SingleQueueExecutor 
*	add ~DerbyServer to mithratestresource jar
## Performance Enhancements
*	no need to check for reindex if there are no extra indices 
*	bumping up the batch size for performance improvement
*	1000 is better than 100, but 10000 is not better than 1000 performance tweaks (from poleposition)
## Bug Fixes
*	correct behavior for full cached dated objects with relationships to non-dated objects 
*	make sure the cache entries are cleared when external changes occur to dated objects 
*	dont choose java keywords as attribute names when creating xmls from existing schema 
*	truncate application name, otherwise causes sybase error on login

# 5.6.0 (01/09/2007)

## Enhancements and New Features
*	Generating parameterized Mithra lists for compile-time safety
*	Use the per database max clause
*	Reduced the amount of generated code
## Bug Fixes
*	Fixed the issue that Tax had with equalsEdgePoint used with relationships

# 5.5.0 (01/02/2007)

## Enhancements and New Features
*	For bulk insert, use syscolumns to construct create table statment instead of select into to avoid l
## Performance Enhancements
*	Improvements to Sybase timestamp read time, transactional bcp
## Bug Fixes
*	Fixed order by not generating as of attribute sql. cleaned up sql query
*	Fixed 2 updates that are really just one
*	Fixed update count when attributes are updated in audit only objects

# 5.1.1 - (built and tested using JDK 1.5.0_06)  (11/22/2006)

## Enhancements and New Features
*	JDK 1.5 style lock
*	Use the JDK 1.5 AbstractQueuedSynchronizer
*	Better fail message
*	Ensure copyDetachedValuesToOriginalOrInsertIfNewUntil cascades to life cycle dependent objects
*	For cursor reads, we can avoid write-locking the cache
*	Ensure an interrupted or long waiting writer does not put the lock in an inconsistent state
*	Reduce relationship cache size to exercise a code path
*	Better failure detection and diagnostic printout
*	Make sure we cascade insert when copyDetached is used
*	Implemented multi-in updates
*	Better failure detection and diagnostic printout
*	Refactored templates to reduced amount of MithraList generated code
## Bug Fixes
*	Fixed bug in detached lists when removing from list using object
*	Make sure transactional index does not return stale data
*	Fixed resizing index with transactional objects
*	If an inner transaction fails with a retriable exception, make sure the outer transaction is retriable
*	Make the behavior of not operations consistent with SQL, where null does not match anything
*	Fixed cascadeTerminate so it terminates life cycle dependent objects
*	Fixed null statement generation
*	Fixed missing and in the sql
*	Fixed odd situation when we get a duplicate update

# 4.3.2 (11/02/2006)

## Enhancements and New Features
*	Refactored templates to reduce the amount of generated code
*	Added a cursor functionality in order to save heap memory while iterate through huge operation based
*	Converted MithraTestResource documentation to docbook
*	Added method to clear the result objects referecnes in a MithraList
*	Added new features for dated and dated detached objects
*	Added FinderUtils class to factor duplicate code out of Finder template for findOne methods
*	MithraLists are random access
*	Added javadoc and clarified a couple of method names
*	Small cleanups and some tweaks for performance
*	Added toLowerCase to string attributes
*	upgrade to ljtm 1.2.2
*	Avoid unnecessary object creation in timezone conversion
*	Added automatic flushing to the integrator transport to reduce time taken during commit
*	Fixed mithras dated cache to be consistent and more performant
*	Better error handling
*	Update to H2 1.0
*	Updated xml libraries to fix mithra-xsddoc build failures with JDK 1.5
*	ljtm 1.2.2 integration for mithra
## Performance Enhancements
*	Better hash combination: faster and less collision prone
*	A little cleanup and faster sybase timestamp reading
## Bug Fixes
*	Added ability to insert and terminate mithra dated objects during the same business date
*	Changed template to generate proper Object attributes comparison
*	Fixed potential issue with non-mithra marshalled transactions
*	Fixed removal of non-detached object from detached list
*	Make the behavior of not operations consistent with SQL, where null does not match
*	Fixed to lower case for dated objects with default dates when it is the only operation
*	Fixed removal of non-detached object from detached list
*	Fixed issues with null strings
*	Fixed trim string

# 4.2.0 (09/25/2006)

## Enhancements and New Features
*	Better status keeping to avoid concurrency issues
*	Initial implementation of detached dated objects
*	Detached dated objects with relationships
*	Added new purge( ) and insertForRecovery( ) methods in Mithra
## Bug Fixes
*	Fixed limited number of attributes
*	Fixed OrderBy bug
*	Fixed all Mithra queries to be cached

# 4.1.0 (09/05/2006)

## Enhancements and New Features
*	Better error catching and reporting
*	Various performance improvements
*	Added Java BCP support
*	Added getNonPersistentCopy method to transactional lists
*	Implemented one-to-many detached object relationship
*	Added the ability to extend database type classes
*	Added getter methods for metadata analysis
## Bug Fixes
*	Fixed NullPointerException when only half of the AsOfAttributes is in table
*	Removed old queries from cache to allow garbage collection
*	Better exception reporting in Local transaction
*	Fixed problem with transactional mithra objects that have nullable primary keys

# 4.0.0 (09/01/2006)

## Enhancements and New Features
*	New Mithra Tool: Mithra Object XML Generator
*	New Mithra Tool: Mithra DDL Generator
*	Enhanced test case coverage
*	Implemented Local Transaction management and removed JOTM
*	Improved error messages
*	Added set methods for relationships in dated objects. Currently for in-memory case only
*	Implemented optimistic locking for dated objects
## Performance Enhancements
*	Optimized multi-in operation for large relationship resolution
*	Various performance optimizations
## Bug Fixes
*	Fixed generated SQL that clean replication notification data
*	Fixed bug when resolving relationship in a transaction
*	Fixed bug with insert followed by update when inserted object is strangely constructed

# 3.1.0 (07/10/2006)

## Enhancements and New Features
*	Implemented executeTransactionalCommandInSeparateThread to reduce repeated code
*	helper methods for compliance serialization
*	Make sure we serialize acmap code
*	Use underlying data to avoid issues with overriden methods
*	Make sure we dont serialize a vendor subclass of Timestamp
*	Implemented read only refresh and lock on update transaction participation mode
*	Account and product use the new read cache update causes refresh tx participation mode
*	between clause is confusing Sybase 12 optimizer
*	Reduce over the wire communication
*	Multi-level hierarchy support
*	Changed name of method updateOriginalOrInsertIfNew to copyDetachedValuesToOriginalOrInsertIfNew
*	Changed update event handler in the MithraNotification Listeners
*	Mithra Replication Notification Feature
*	Better cache expiration on update
*	Improved test cases
*	Improved error messaging
*	Improved logging
*	Made the None operation serializable
*	Implemented serialization for read only dated objects
*	Implemented multi insert

## Bug Fixes
*	Tweaks and fixes to RUNS to work against actual tams data
*	Fixed problem in copyNonPrimaryAttributesFrom. Ensuring the integrity of the data copied by reading the values from the data obj
*	Fixed bug with insert followed by update when inserted object is strangely constructed
*	Fixed missing audit record when update/terminate was done in the recent past
*	Fixed problem in operations that specifiy multiple desks using an IN operation
*	Fix bug when equals edge point is the only supplied operation
*	Fix bulk insert
*	Fixed as of attributes not being marked as such when inherited
*	Fixed bcp schema handling
*	Cleanup and fixed OR operation
*	Make sure we only delist once

# 2.2.0 (06/06/2006)


## Bug Fixes

*Fixed problem that happens when an object is inserted and deleted in the same transaction.
*Fixed multiple splits causing prematurely closed ranges
*fixed problem with list of size 1 being sorted
*fixed commit of transactional list
*fixed issue with simulated sequence and three tier mode. refactored Attribute and AbstractAttribute
*fixed null pointer exception when a non-audited dated object is inserted and terminated in the same 


## Enhacements

*JOTM libraries upgrade.
*Added synchronization mechanism for notification registration. This is used only on test cases.
*added forceRefresh to the list object. Source attributes are not yet implemented.
*added forceRefresh to the list object. Source attributes are not yet implemented.
*Refactored notifcation registration.
*              Added notification registration after inserts.
*              Refactored the creation of notification listeners.


# 2.1.0 (05/07/2006)

## Bug Fixes
*fixed a problem where an exception during DB commit would leave an object tied to that transaction
*Fixed potential deadlocks in Mithra Tranactional objects.
*Fixed problem when expressing a relationship with multiple parameter in a single line.
*Fixed ~NullPointerException problem in ~TransactionOperation.
*Implemented methods od the List interface in the MithraList


## Enhancements
*Added method to the ~MithraTransactionalObject interface to copy non primary key attribute values from another ~MithraTransactionObject
*implemented one to many relationship persistence
*Added setter methods to Mithra ~OperationBased List.
*Added support for char columns when inserting objects.
*Added generation time check to avoid using AsOfAttributes (or part of) in an Index.
*Added method to get the Mithra data to copy based on the Mithra object's transactional behavior.
*Added non strongly-typed method to copy non primary key attribute values from another ~MithraTransactionObject.
*Added checks for infinity (positive or negative) values in the transactional Mithra objects.


# 1.2.0 (04/25/2006)

## Enhancements and New Features

*	Changed the way Mithra internal notification system handles self notification messages.
*	New functionality to copy non-primary key attributes.
*	Implementation of method to clear the full cache.
*	Added classes to support Mithra notifications using RV7.
*	Enhanced Mithra Notification processing.
*	Enhanced Full cache notification processing. Added more test cases.
*	faster cache locking
*	performance improvement
*	better test coverage
*	EM synch up of tran id provider fix
*	Made the pool size settable via properties
*	Mithra BLOB support
*	added GS integrator tests

## Bug Fixes

*	bug fix for lock class
*	fix exists query with dated objects in a chained mapper
*	fix for objects changing too fast (usually unit tests)
*	Fix for intermittent failure. Make sure we assign default dates from the top down
*	Fixed Mithra operation problem when bypassing cache.
*	Fixed problem that occurs when NaN is set in double or float attributes of Mithra Transactional objects.
*	Fixed ~NullPointerException problem in ~TransactionOperation.
